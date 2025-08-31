package co.edu.uniquindio.proyecto.software.demo.service;

import co.edu.uniquindio.proyecto.software.demo.dto.ReviewRequestDto;
import co.edu.uniquindio.proyecto.software.demo.model.Review;
import co.edu.uniquindio.proyecto.software.demo.repository.BookRepository;
import co.edu.uniquindio.proyecto.software.demo.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final BookRepository bookRepository;

    public ReviewService(ReviewRepository reviewRepository, BookRepository bookRepository) {
        this.reviewRepository = reviewRepository;
        this.bookRepository = bookRepository;
    }

    public List<Review> getReviewsForBook(String bookId) {
        return reviewRepository.findByBookId(bookId);
    }

    public Review createReview(ReviewRequestDto dto) {
        if (dto.getBookId() == null || dto.getBookId().isEmpty()) {
            throw new IllegalArgumentException("El bookId es obligatorio");
        }

        // Verificar que el libro exista antes de crear la review
        bookRepository.findById(dto.getBookId())
                .orElseThrow(() -> new IllegalArgumentException("El libro con id " + dto.getBookId() + " no existe"));

        // Crear y guardar review
        Review review = new Review(dto.getBookId(), dto.getComment(), dto.getRating());
        return reviewRepository.save(review);
    }
}

package co.edu.uniquindio.proyecto.software.demo.controller;

import co.edu.uniquindio.proyecto.software.demo.dto.ReviewRequestDto;
import co.edu.uniquindio.proyecto.software.demo.model.Review;
import co.edu.uniquindio.proyecto.software.demo.repository.ReviewRepository;
import co.edu.uniquindio.proyecto.software.demo.service.ReviewService;

import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;
    private final ReviewRepository reviewRepository;

      public ReviewController(ReviewService reviewService, ReviewRepository reviewRepository) {
        this.reviewService = reviewService;
        this.reviewRepository = reviewRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Review> getReviewById(@PathVariable String id) {
        System.out.println("Entrando al endpoint con id = " + id);
        return reviewRepository.findById(new ObjectId(id))
                .map(review -> {
                    System.out.println("Documento encontrado: " + review);
                    return ResponseEntity.ok(review);
                })
                .orElseGet(() -> {
                    System.out.println("No se encontró documento con id = " + id);
                    return ResponseEntity.notFound().build();
                });
    }

    @PostMapping
    public Review createReview(@RequestBody ReviewRequestDto dto) {
        return reviewService.createReview(dto);
    }

    @PostMapping("/preview")
    public Review previewReview(@RequestBody ReviewRequestDto dto) {
        Review review = new Review(dto.getBookId(), dto.getComment(), dto.getRating());
        return review;
    }

    // Obtener todas las reviews de un libro
    @GetMapping("/book/{bookId}")
        public List<Review> getReviewsByBook(@PathVariable String bookId) {
        return reviewService.getReviewsForBook(bookId);
    }
}

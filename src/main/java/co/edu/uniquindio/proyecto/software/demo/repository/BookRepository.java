package co.edu.uniquindio.proyecto.software.demo.repository;

import co.edu.uniquindio.proyecto.software.demo.model.Book;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

     // Búsqueda básica: título o autor
    List<Book> findByTituloContainingIgnoreCaseOrAutorContainingIgnoreCase(String titulo, String autor);

    // Búsqueda avanzada: título, autor e ISBN
    List<Book> findByTituloContainingIgnoreCaseAndAutorContainingIgnoreCaseAndIsbnContainingIgnoreCase(
        String titulo, String autor, String isbn
    );
}

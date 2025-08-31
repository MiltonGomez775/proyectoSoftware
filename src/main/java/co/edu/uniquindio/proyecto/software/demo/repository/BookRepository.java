package co.edu.uniquindio.proyecto.software.demo.repository;

import co.edu.uniquindio.proyecto.software.demo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}

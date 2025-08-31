package co.edu.uniquindio.proyecto.software.demo.repository;

import co.edu.uniquindio.proyecto.software.demo.model.Review;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

    List<Review> findByBookId(String bookId);
}

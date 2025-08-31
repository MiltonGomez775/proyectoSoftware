package co.edu.uniquindio.proyecto.software.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {

    @Id
    private ObjectId  id;
    private String bookId;
    private String comment;
    private int rating;

    public Review() {}

    public Review(String bookId, String comment, int rating) {
        this.bookId = bookId;
        this.comment = comment;
        this.rating = rating;
    }

    // Getters y setters
    public ObjectId getId() { return id; }
    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getBookId() { return bookId; }
    public void setBookId(String bookId) { this.bookId = bookId; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
}

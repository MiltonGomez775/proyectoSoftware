package co.edu.uniquindio.proyecto.software.demo.dto;

public class ReviewRequestDto {
    private String bookId;
    private String comment;
    private int rating;

    public String getBookId() { return bookId; }
    public void setBookId(String bookId) { this.bookId = bookId; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
}

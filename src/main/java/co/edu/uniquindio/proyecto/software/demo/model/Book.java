package co.edu.uniquindio.proyecto.software.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "books")
public class Book {

    @Id
    private String id;
    private String titulo;
    private String autor;
    private String isbn;
    private String anio;

    public Book() {}

    public Book(String titulo, String autor, String isbn, String anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anio = anio;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getAnio() { return anio; }
    public void setAnio(String anio) { this.anio = anio; }
}

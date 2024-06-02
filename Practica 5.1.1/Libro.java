import java.io.Serializable;

public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;

    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String isbn, String titulo, String autor, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Getters y setters
}

// Clase abstracta RecursoBibliografico
public abstract class RecursoBibliografico {
    protected String titulo;
    protected int anioPublicacion;

    public RecursoBibliografico(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    // Métodos abstractos
    public abstract void prestar();
    public abstract void devolver();
}

// Interfaz Consultable
public interface Consultable {
    boolean consultarDisponibilidad();
}

// Clase Libro que hereda de RecursoBibliografico e implementa Consultable
public class Libro extends RecursoBibliografico implements Consultable {
    private String autor;
    private String genero;
    private boolean disponible;

    public Libro(String titulo, int anioPublicacion, String autor, String genero) {
        super(titulo, anioPublicacion);
        this.autor = autor;
        this.genero = genero;
        this.disponible = true; // Inicialmente, el libro está disponible
    }

    // Implementación de métodos abstractos de RecursoBibliografico
    @Override
    public void prestar() {
        if (disponible) {
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
            disponible = false;
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible en este momento.");
        }
    }

    @Override
    public void devolver() {
        if (!disponible) {
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
            disponible = true;
        } else {
            System.out.println("No se puede devolver un libro que ya está disponible.");
        }
    }

    // Implementación del método de la interfaz Consultable
    @Override
    public boolean consultarDisponibilidad() {
        return disponible;
    }
}

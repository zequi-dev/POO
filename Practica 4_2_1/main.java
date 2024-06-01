
import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private boolean disponible;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void prestarLibro() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible en este momento.");
        }
    }

    public void devolverLibro() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está en la biblioteca.");
        }
    }

    public boolean verificarDisponibilidad() {
        return disponible;
    }
}

class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void añadirLibro(Libro libro) {
        libros.add(libro);
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido añadido a la biblioteca.");
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido eliminado de la biblioteca.");
    }


    public void prestarLibro(Libro libro) {
        libro.prestarLibro();
    }

    public void devolverLibro(Libro libro) {
        libro.devolverLibro();
    }
}

class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void realizarReserva() {
        System.out.println("El usuario '" + nombre + "' ha realizado una reserva.");
    }

    public void verificarMulta() {
        System.out.println("El usuario '" + nombre + "' está verificando si tiene alguna multa pendiente.");
    }
}

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Señor de los Anillos");
        Libro libro2 = new Libro("Harry Potter");
        Usuario usuario1 = new Usuario("Juan");
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.añadirLibro(libro1);
        biblioteca.añadirLibro(libro2);

        biblioteca.prestarLibro(libro1);
        biblioteca.devolverLibro(libro1);
        biblioteca.prestarLibro(libro1);

        usuario1.realizarReserva();
        usuario1.verificarMulta();
    }
}


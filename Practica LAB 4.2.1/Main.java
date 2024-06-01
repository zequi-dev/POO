package gestionbiblioteca;

import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private String autor;
    private int ejemplaresDisponibles;

    public Libro(String titulo, String autor, int ejemplaresDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void prestar() {
        if (ejemplaresDisponibles > 0) {
            ejemplaresDisponibles--;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("No hay ejemplares disponibles del libro '" + titulo + "'.");
        }
    }

    public void devolver() {
        ejemplaresDisponibles++;
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }
}

class Biblioteca {
    private List<Libro> inventario;

    public Biblioteca() {
        this.inventario = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        inventario.add(libro);
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido agregado al inventario.");
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : inventario) {
            if (libro.getTitulo().equals(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no está en el inventario.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : inventario) {
            if (libro.getTitulo().equals(titulo)) {
                libro.devolver();
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no está en el inventario.");
    }
}

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 3);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.prestarLibro("Cien años de soledad");
        biblioteca.prestarLibro("Don Quijote de la Mancha");
        biblioteca.devolverLibro("Cien años de soledad");
    }
}

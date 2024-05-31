public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El Señor de los Anillos", 1954, "J.R.R. Tolkien", "Fantasía");

        // Consultar disponibilidad antes de prestar
        if (libro.consultarDisponibilidad()) {
            libro.prestar();
        } else {
            System.out.println("El libro no está disponible en este momento.");
        }

        // Devolver el libro
        libro.devolver();
    }
}
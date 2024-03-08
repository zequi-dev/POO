import java.util.Scanner;

public class Practica2_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el género:");
        String genero = scanner.nextLine();

        System.out.println("Ingrese la dirección:");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese la profesión:");
        String profesion = scanner.nextLine();

        Humano persona1 = new Humano(nombre, edad, genero, direccion, profesion);

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Género: " + persona1.getGenero());
        System.out.println("Dirección: " + persona1.getDireccion());
        System.out.println("Profesión: " + persona1.getProfesion());

        persona1.comer("pizza");
        persona1.dormir(8);
        persona1.tomarDucha(12);

        scanner.close();
    }
}

import java.util.Scanner;

public class Practica2_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona1 = new Persona();
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

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Género: " + genero);
            System.out.println("Dirección: " + direccion);
            System.out.println("Profesión: " + profesion);
            Persona.comer("pizza");
            persona1.dormir(8);
            persona1.hacerEjercicio("correr");
        scanner.close();
    }
}
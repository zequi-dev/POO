import java.util.Scanner;

public class Practica2_1_1_v2 {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){

		System.out.println("Ingrese numero de alumnos: ");
		Alumno[] alumnos = new Alumno[scanner.nextInt()]; 
		scanner.nextLine(); 
		
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = new Alumno();
		}
		
		System.out.println("\nDatos de los alumnos:");
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
			System.out.println("Nombre: " + alumnos[i].SetGet("nombre", scanner.nextLine()));
			System.out.println();
			System.out.println("Ingrese la matrícula del alumno " + (i + 1) + ":");
			System.out.println("Matrícula: " + alumnos[i].SetGet("matricula", scanner.nextInt()));
			System.out.println();
			System.out.println("Ingrese el promedio del alumno " + (i + 1) + ":");
			System.out.println("Promedio: " + alumnos[i].SetGet("promedio",scanner.nextDouble()));
			System.out.println();
			scanner.nextLine(); // Consumir el salto de línea
			System.out.println("Ingrese el email del alumno " + (i + 1)	+ ":");
			System.out.println("Email: " + alumnos[i].SetGet("email",scanner.nextLine()));
			System.out.println("GENIAL");
		
		    }
	    }
    }
}
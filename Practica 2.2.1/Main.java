import java.util.Scanner;

class Persona {
    // Atributos demográficos
    private String nombre;
    private int edad;
    private String genero;
    private String direccion;
    private String profesion;

    // Constructor
    public Persona(String nombre, int edad, String genero, String direccion, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.profesion = profesion;
    }

    // Métodos set y get para cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    // Método estático para comer
    public static void comer(String comida) {
        System.out.println("La persona está comiendo " + comida);
    }

    // Métodos no estáticos para dormir y hacer ejercicio
    public void dormir(int horas) {
        System.out.println("La persona está durmiendo durante " + horas + " horas");
    }

    public void hacerEjercicio(String ejercicio) {
        System.out.println("La persona está haciendo ejercicio de tipo " + ejercicio);
    }

    // Método para desplegar los datos de la persona
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Dirección: " + direccion);
        System.out.println("Profesión: " + profesion);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona1 = null;

        int opcion;
        do {
            // Mostrar el menú
            System.out.println("\nMENU");
            System.out.println("1. Ingresar datos de la persona");
            System.out.println("2. Mostrar datos de la persona");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Solicitar al usuario que ingrese los datos de la persona
                    System.out.println("Ingrese el nombre:");
                    String nombre = scanner.nextLine();
                    
                    System.out.println("Ingrese la edad:");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    
                    System.out.println("Ingrese el género:");
                    String genero = scanner.nextLine();
                    
                    System.out.println("Ingrese la dirección:");
                    String direccion = scanner.nextLine();
                    
                    System.out.println("Ingrese la profesión:");
                    String profesion = scanner.nextLine();

                    // Crear una instancia de Persona con los datos proporcionados por el usuario
                    persona1 = new Persona(nombre, edad, genero, direccion, profesion);
                    break;
                case 2:
                    // Verificar si se han ingresado datos de la persona
                    if (persona1 != null) {
                        // Mostrar los datos de la persona
                        persona1.mostrarDatos();
                        Persona.comer("pizza");
                        persona1.dormir(8);
                        persona1.hacerEjercicio("correr");
                                    } else {
                        System.out.println("Primero debe ingresar los datos de la persona.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
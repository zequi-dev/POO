import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Persona> personas = new ArrayList<>();
        List<Materia> materias = new ArrayList<>();
        
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Ingresar datos de estudiante");
            System.out.println("2. Ingresar datos de materia");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch(opcion) {
                case 1:
                    System.out.println("\nCaptura de datos del estudiante:");
                    personas.add(capturarDatosPersona(new Estudiante(), scanner));
                    break;
                case 2:
                    System.out.println("\nCaptura de datos de la materia:");
                    capturarDatosMateria(materias, scanner);
                    break;
                case 3:
                    System.out.println("\nDatos de las personas:");
                    imprimirDatosPersonas(personas);
                    System.out.println("\nDatos de las materias:");
                    imprimirDatosMaterias(materias);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 5.");
            }
        } while(opcion != 4);
        
        scanner.close();
    }
    
    public static Persona capturarDatosPersona(Persona persona, Scanner scanner) {
        System.out.print("Ingrese el nombre: ");
        persona.setGet("nombre", scanner.nextLine());
        System.out.print("Ingrese la edad: ");
        persona.setGet("edad", scanner.nextInt());
        scanner.nextLine(); 
        if (persona instanceof Estudiante) {
            System.out.print("Ingrese la matrícula: ");
            ((Estudiante) persona).setGet("matricula", scanner.nextLine());
        }
        return persona;
    }
    
    public static void imprimirDatosPersonas(List<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            if (persona instanceof Estudiante) {
                System.out.println("Matrícula: " + ((Estudiante) persona).getMatricula());
            }
            System.out.println("---------------------");
        }
    }
    
    public static void capturarDatosMateria(List<Materia> materias, Scanner scanner) {
        Materia materia = new Materia();
        System.out.print("Ingrese el nombre de la materia: ");
        materia.nombre = scanner.nextLine();
        System.out.print("Ingrese el nombre del profesor de la materia: ");
        materia.profesor = scanner.nextLine();
        System.out.print("Ingrese el número de créditos de la materia: ");
        materia.creditos = scanner.nextInt();
        materias.add(materia);
    }
    
    public static void imprimirDatosMaterias(List<Materia> materias) {
        for (Materia materia : materias) {
            System.out.println("Nombre de la materia: " + materia.nombre);
            System.out.println("Profesor de la materia: " + materia.profesor);
            System.out.println("Número de créditos de la materia: " + materia.creditos);
            System.out.println("---------------------");
        }
    }
}

class Persona {
    private String nombre;
    private int edad;

    // Método setGet para nombre y edad
    public void setGet(String attribute, Object value) {
        switch (attribute) {
            case "nombre":
                if (value instanceof String) {
                    this.nombre = (String) value;
                } else {
                    System.out.println("Error: El valor debe ser de tipo String para el atributo nombre.");
                }
                break;
            case "edad":
                if (value instanceof Integer) {
                    this.edad = (int) value;
                } else {
                    System.out.println("Error: El valor debe ser de tipo Integer para el atributo edad.");
                }
                break;
            default:
                System.out.println("Error: El atributo especificado no existe en la clase Persona.");
        }
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

class Estudiante extends Persona {
    private String matricula;

    // Método setGet para matricula
    public void setGet(String attribute, Object value) {
        if (attribute.equals("matricula")) {
            if (value instanceof String) {
                this.matricula = (String) value;
            } else {
                System.out.println("Error: El valor debe ser de tipo String para el atributo matrícula.");
            }
        } else {
            super.setGet(attribute, value); // Llamada al método setGet de la superclase
        }
    }

    // Método get para matricula
    public String getMatricula() {
        return matricula;
    }
}

class Materia {
    String nombre;
    String profesor;
    int creditos;
}

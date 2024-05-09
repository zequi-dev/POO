package Tarea3_1_1.java;

// Clase Empleado
public class Empleado {
    // Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    // Constructor
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    // Métodos
    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerSalario() {
        return salario;
    }
}

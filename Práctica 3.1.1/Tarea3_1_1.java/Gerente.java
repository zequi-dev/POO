package Tarea3_1_1.java;

// Clase Gerente (hereda de Empleado)
public class Gerente extends Empleado {
    // Atributos adicionales
    String departamento;
    int nivelJerarquico;

    // Constructor
    public Gerente(String nombre, String apellido, int edad, double salario, String departamento, int nivelJerarquico) {
        super(nombre, apellido, edad, salario);
        this.departamento = departamento;
        this.nivelJerarquico = nivelJerarquico;
    }

    // Métodos adicionales
    public void asignarTareas() {
        System.out.println("Asignando tareas...");
    }

    public void aprobarVacaciones() {
        System.out.println("Aprobando vacaciones...");
    }
}
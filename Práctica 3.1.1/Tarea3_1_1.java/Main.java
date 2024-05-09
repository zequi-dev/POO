package Tarea3_1_1.java;

// Clase principal para probar las clases Empleado y Gerente
public class Main {
    public static void main(String[] args) {
        // Crear un empleado
        Empleado empleado1 = new Empleado("Juan", "Perez", 30, 2000);
        System.out.println("Nombre del empleado: " + empleado1.obtenerNombre());
        System.out.println("Salario del empleado: " + empleado1.obtenerSalario());

        // Crear un gerente
        Gerente gerente1 = new Gerente("Ana", "Gomez", 35, 3000, "Ventas", 1);
        System.out.println("Nombre del gerente: " + gerente1.obtenerNombre());
        System.out.println("Salario del gerente: " + gerente1.obtenerSalario());
        System.out.println("Departamento del gerente: " + gerente1.departamento);
        System.out.println("Nivel jerárquico del gerente: " + gerente1.nivelJerarquico);

        // Llamar a métodos adicionales de Gerente
        gerente1.asignarTareas();
        gerente1.aprobarVacaciones();
    }
}
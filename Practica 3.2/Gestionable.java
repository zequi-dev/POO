// Clase abstracta Empleado
public abstract class Empleado {
    protected String nombre;
    protected int id;
    protected double salarioBase;
    
    public Empleado(String nombre, int id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }
    
    // Método abstracto para calcular el salario (debe ser implementado por las subclases)
    public abstract double calcularSalario();
    
    // Método para mostrar los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario Base: $" + salarioBase);
    }
}

// Interfaz Gestionable
public interface Gestionable {
    void registrarEmpleado(Empleado empleado);
    void eliminarEmpleado(int id);
    void actualizarEmpleado(int id, Empleado empleado);
}

// Implementación de una subclase de Empleado
public class Gerente extends Empleado {
    private double bono;
    
    public Gerente(String nombre, int id, double salarioBase, double bono) {
        super(nombre, id, salarioBase);
        this.bono = bono;
    }
    
    @Override
    public double calcularSalario() {
        // El salario de un gerente es el salario base más el bono
        return salarioBase + bono;
    }
}

// Implementación de la interfaz Gestionable
public class SistemaRecursosHumanos implements Gestionable {
    private List<Empleado> empleados;

    public SistemaRecursosHumanos() {
        this.empleados = new ArrayList<>();
    }
    
    @Override
    public void registrarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado registrado: " + empleado.nombre);
    }
    
    @Override
    public void eliminarEmpleado(int id) {
        for (Empleado empleado : empleados) {
            if (empleado.id == id) {
                empleados.remove(empleado);
                System.out.println("Empleado eliminado: " + empleado.nombre);
                return;
            }
        }
        System.out.println("Empleado con ID " + id + " no encontrado.");
    }
    
    @Override
    public void actualizarEmpleado(int id, Empleado nuevoEmpleado) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).id == id) {
                empleados.set(i, nuevoEmpleado);
                System.out.println("Empleado actualizado: " + nuevoEmpleado.nombre);
                return;
            }
        }
        System.out.println("Empleado con ID " + id + " no encontrado.");
    }
}

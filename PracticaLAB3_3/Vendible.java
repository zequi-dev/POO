// Clase abstracta Producto
public abstract class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método abstracto
    public abstract double calcularPrecioVenta();
}

// Interfaz Vendible
public interface Vendible {
    void vender(int cantidad);
}

// Clase concreta HijoSku que hereda de Producto e implementa Vendible
public class HijoSku extends Producto implements Vendible {
    private String sku;
    private int stock;

    public HijoSku(String nombre, double precio, String sku, int stock) {
        super(nombre, precio);
        this.sku = sku;
        this.stock = stock;
    }

    // Implementación del método abstracto de Producto
    @Override
    public double calcularPrecioVenta() {
        return precio; // Se puede implementar un cálculo específico aquí si es necesario
    }

    // Implementación del método de la interfaz Vendible
    @Override
    public void vender(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
            System.out.println("Se han vendido " + cantidad + " unidades del producto " + nombre);
        } else {
            System.out.println("No hay suficiente stock para vender " + cantidad + " unidades del producto " + nombre);
        }
    }
}

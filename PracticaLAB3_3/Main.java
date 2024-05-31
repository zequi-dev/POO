public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase HijoSku
        HijoSku producto = new HijoSku("Camisa", 25.0, "SKU123", 50);

        // Vender algunas unidades del producto
        producto.vender(10);
        producto.vender(30);
        producto.vender(20);
    }
}

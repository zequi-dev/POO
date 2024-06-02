import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Clase para representar un pedido
class Pedido {
    private String plato;

    public Pedido(String plato) {
        this.plato = plato;
    }

    public String getPlato() {
        return plato;
    }
}

// Clase para representar una mesa
class Mesa {
    private int numero;
    private Pedido pedido;

    public Mesa(int numero) {
        this.numero = numero;
    }

    public synchronized void realizarPedido(String plato) {
        pedido = new Pedido(plato);
        System.out.println("Pedido realizado en la mesa " + numero + ": " + plato);
    }

    public synchronized Pedido getPedido() {
        return pedido;
    }
}

// Clase para representar un camarero
class Camarero implements Runnable {
    private int id;
    private Mesa mesa;
    private ConcurrentHashMap<Integer, Mesa> mesas;

    public Camarero(int id, ConcurrentHashMap<Integer, Mesa> mesas) {
        this.id = id;
        this.mesas = mesas;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) { // Simulación de tomar pedidos de 5 mesas
            mesa = mesas.get(i);
            mesa.realizarPedido("Plato " + i);
            try {
                Thread.sleep(1000); // Simulación de tiempo para tomar el pedido
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Restaurante {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Mesa> mesas = new ConcurrentHashMap<>();

        // Crear 5 mesas
        for (int i = 1; i <= 5; i++) {
            mesas.put(i, new Mesa(i));
        }

        // Crear camareros y ejecutarlos en un ThreadPoolExecutor
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 3; i++) { // 3 camareros
            executor.execute(new Camarero(i, mesas));
        }
        executor.shutdown();
    }
}

class CpoHumano {
    private int edad;
    private double altura;
    private double peso;
    private Corazon corazon;
    private Pulmon pulmon;
    private Higado higado;
    private Apendice apendice;

    // Constructor
    public CpoHumano(int edad, double altura, double peso) {
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.corazon = new Corazon(70, "Normal", "A+");
        this.pulmon = new Pulmon(6000, "Normal", "Sano");
        this.higado = new Higado("Metabolismo", "Normal", "Funcionando");
        this.apendice = new Apendice("Pequeño", "Sano", false);
    }

    // Getters
    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public Pulmon getPulmon() {
        return pulmon;
    }

    public Higado getHigado() {
        return higado;
    }

    public Apendice getApendice() {
        return apendice;
    }
}

// Clase principal
public class CuerpoHumano {
    public static void main(String[] args) {
        // Crear objeto CpoHumano
        CpoHumano miCuerpo = new CpoHumano(30, 170.5, 70.0);

        // Imprimir valores
        System.out.println("Edad: " + miCuerpo.getEdad() + " años");
        System.out.println("Altura: " + miCuerpo.getAltura() + " cm");
        System.out.println("Peso: " + miCuerpo.getPeso() + " kg");

        System.out.println("\nDetalles del corazón:");
        System.out.println("Ritmo cardiaco: " + miCuerpo.getCorazon().getRitmoCardiaco() + " bpm");
        System.out.println("Tamaño: " + miCuerpo.getCorazon().getTamaño());
        System.out.println("Tipo de sangre: " + miCuerpo.getCorazon().getTipoSangre());

        System.out.println("\nDetalles del pulmón:");
        System.out.println("Capacidad respiratoria: " + miCuerpo.getPulmon().getCapacidadRespiratoria() + " ml");
        System.out.println("Tamaño: " + miCuerpo.getPulmon().getTamaño());
        System.out.println("Estado: " + miCuerpo.getPulmon().getEstado());

        System.out.println("\nDetalles del hígado:");
        System.out.println("Función hepática: " + miCuerpo.getHigado().getFunciónHepática());
        System.out.println("Tamaño: " + miCuerpo.getHigado().getTamaño());
        System.out.println("Estado: " + miCuerpo.getHigado().getEstado());

        System.out.println("\nDetalles del apéndice:");
        System.out.println("Tamaño: " + miCuerpo.getApendice().getTamaño());
        System.out.println("Estado: " + miCuerpo.getApendice().getEstado());
        System.out.println("¿Dolor?: " + (miCuerpo.getApendice().isDolor() ? "Sí" : "No"));
    }
}
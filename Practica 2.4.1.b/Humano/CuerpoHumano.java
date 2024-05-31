
public class CuerpoHumano {
    // Atributos de CuerpoHumano
    private String nombre;
    private int edad;
    private double peso;

    // Componentes como clases anidadas
    private Corazon corazon;
    private Pulmon pulmonIzquierdo;
    private Pulmon pulmonDerecho;
    private Higado higado;
    private Apendice apendice;

    // Constructor
    public CuerpoHumano(String nombre, int edad, double peso, int latidosPorMinuto, double capacidadPulmonarIzq, double capacidadPulmonarDer, double tamanoHigado) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.corazon = new Corazon(latidosPorMinuto);
        this.pulmonIzquierdo = new Pulmon(capacidadPulmonarIzq);
        this.pulmonDerecho = new Pulmon(capacidadPulmonarDer);
        this.higado = new Higado(tamanoHigado);
        this.apendice = new Apendice();
    }

    // Getters y Setters para CuerpoHumano
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Métodos para acceder a los componentes
    public Corazon getCorazon() {
        return corazon;
    }

    public Pulmon getPulmonIzquierdo() {
        return pulmonIzquierdo;
    }

    public Pulmon getPulmonDerecho() {
        return pulmonDerecho;
    }

    public Higado getHigado() {
        return higado;
    }

    public Apendice getApendice() {
        return apendice;
    }

    // Clase anidada Corazon
    public class Corazon {
        private int latidosPorMinuto;

        public Corazon(int latidosPorMinuto) {
            this.latidosPorMinuto = latidosPorMinuto;
        }

        public int getLatidosPorMinuto() {
            return latidosPorMinuto;
        }

        public void setLatidosPorMinuto(int latidosPorMinuto) {
            this.latidosPorMinuto = latidosPorMinuto;
        }
    }

    // Clase anidada Pulmon
    public class Pulmon {
        private double capacidad;

        public Pulmon(double capacidad) {
            this.capacidad = capacidad;
        }

        public double getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(double capacidad) {
            this.capacidad = capacidad;
        }
    }

    // Clase anidada Higado
    public class Higado {
        private double tamano;

        public Higado(double tamano) {
            this.tamano = tamano;
        }

        public double getTamano() {
            return tamano;
        }

        public void setTamano(double tamano) {
            this.tamano = tamano;
        }
    }

    // Clase anidada Apendice
    public class Apendice {
        private boolean tieneApendicitis;

        public Apendice() {
            this.tieneApendicitis = false; // Valor predeterminado
        }

        public boolean isTieneApendicitis() {
            return tieneApendicitis;
        }

        public void setTieneApendicitis(boolean tieneApendicitis) {
            this.tieneApendicitis = tieneApendicitis;
        }
    }

    // Programa principal
    public static void main(String[] args) {
        CuerpoHumano cuerpo = new CuerpoHumano("Juan", 30, 75.5, 70, 6.0, 6.2, 1.5);

        // Mostrar información del cuerpo humano y sus componentes
        System.out.println("Nombre: " + cuerpo.getNombre());
        System.out.println("Edad: " + cuerpo.getEdad());
        System.out.println("Peso: " + cuerpo.getPeso());
        System.out.println("Latidos por minuto del corazón: " + cuerpo.getCorazon().getLatidosPorMinuto());
        System.out.println("Capacidad del pulmón izquierdo: " + cuerpo.getPulmonIzquierdo().getCapacidad());
        System.out.println("Capacidad del pulmón derecho: " + cuerpo.getPulmonDerecho().getCapacidad());
        System.out.println("Tamaño del hígado: " + cuerpo.getHigado().getTamano());
        System.out.println("¿Tiene apendicitis?: " + cuerpo.getApendice().isTieneApendicitis());
    }
}

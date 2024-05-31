public class Main {
    // Clase Rueda
    static class Rueda {
        private int tamaño;
        private String material;
        private String tipo;

        // Constructor
        public Rueda(int tamaño, String material, String tipo) {
            this.tamaño = tamaño;
            this.material = material;
            this.tipo = tipo;
        }

        // Getters y Setters
        public int getTamaño() {
            return tamaño;
        }

        public String getMaterial() {
            return material;
        }

        public String getTipo() {
            return tipo;
        }
    }

    // Clase Cuadro
    static class Cuadro {
        private String material;
        private String tamaño;
        private String tipo;

        // Constructor
        public Cuadro(String material, String tamaño, String tipo) {
            this.material = material;
            this.tamaño = tamaño;
            this.tipo = tipo;
        }

        // Getters y Setters
        public String getMaterial() {
            return material;
        }

        public String getTamaño() {
            return tamaño;
        }

        public String getTipo() {
            return tipo;
        }
    }

    // Clase Bicicleta
    static class Bicicleta {
        private String marca;
        private String modelo;
        private String color;
        private Rueda ruedaDelantera;
        private Rueda ruedaTrasera;
        private Cuadro cuadro;

        // Constructor
        public Bicicleta(String marca, String modelo, String color) {
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
            this.ruedaDelantera = new Rueda(26, "Aluminio", "Deportiva");
            this.ruedaTrasera = new Rueda(26, "Aluminio", "Deportiva");
            this.cuadro = new Cuadro("Acero", "M", "Montaña");
        }

        // Getters
        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public String getColor() {
            return color;
        }

        public Rueda getRuedaDelantera() {
            return ruedaDelantera;
        }

        public Rueda getRuedaTrasera() {
            return ruedaTrasera;
        }

        public Cuadro getCuadro() {
            return cuadro;
        }
    }

    // Método main
    public static void main(String[] args) {
        // Crear objeto Bicicleta
        Bicicleta miBicicleta = new Bicicleta("Trek", "X-Caliber 9", "Negro");

        // Imprimir valores
        System.out.println("Marca de la bicicleta: " + miBicicleta.getMarca());
        System.out.println("Modelo de la bicicleta: " + miBicicleta.getModelo());
        System.out.println("Color de la bicicleta: " + miBicicleta.getColor());

        System.out.println("\nDetalles de la rueda delantera:");
        System.out.println("Tamaño: " + miBicicleta.getRuedaDelantera().getTamaño());
        System.out.println("Material: " + miBicicleta.getRuedaDelantera().getMaterial());
        System.out.println("Tipo: " + miBicicleta.getRuedaDelantera().getTipo());

        System.out.println("\nDetalles de la rueda trasera:");
        System.out.println("Tamaño: " + miBicicleta.getRuedaTrasera().getTamaño());
        System.out.println("Material: " + miBicicleta.getRuedaTrasera().getMaterial());
        System.out.println("Tipo: " + miBicicleta.getRuedaTrasera().getTipo());

        System.out.println("\nDetalles del cuadro:");
        System.out.println("Material: " + miBicicleta.getCuadro().getMaterial());
        System.out.println("Tamaño: " + miBicicleta.getCuadro().getTamaño());
        System.out.println("Tipo: " + miBicicleta.getCuadro().getTipo());
    }
}

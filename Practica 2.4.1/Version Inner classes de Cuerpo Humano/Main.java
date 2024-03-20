public class Main {
    // Clase CuerpoHumano
    static class CuerpoHumano {
        private int edad;
        private double altura;
        private double peso;
        private Corazon corazon;
        private Pulmon pulmon;
        private Higado higado;
        private Apendice apendice;

        // Constructor
        public CuerpoHumano(int edad, double altura, double peso) {
            this.edad = edad;
            this.altura = altura;
            this.peso = peso;
            this.corazon = new Corazon();
            this.pulmon = new Pulmon();
            this.higado = new Higado();
            this.apendice = new Apendice();
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

        // Clase Corazon (clase interna)
        class Corazon {
            private int ritmoCardiaco;
            private String tamaño;
            private String tipoSangre;

            // Constructor
            public Corazon() {
                this.ritmoCardiaco = 70;
                this.tamaño = "Normal";
                this.tipoSangre = "A+";
            }

            // Getters
            public int getRitmoCardiaco() {
                return ritmoCardiaco;
            }

            public String getTamaño() {
                return tamaño;
            }

            public String getTipoSangre() {
                return tipoSangre;
            }
        }

        // Clase Pulmon (clase interna)
        class Pulmon {
            private int capacidadRespiratoria;
            private String tamaño;
            private String estado;

            // Constructor
            public Pulmon() {
                this.capacidadRespiratoria = 6000;
                this.tamaño = "Normal";
                this.estado = "Sano";
            }

            // Getters
            public int getCapacidadRespiratoria() {
                return capacidadRespiratoria;
            }

            public String getTamaño() {
                return tamaño;
            }

            public String getEstado() {
                return estado;
            }
        }

        // Clase Higado (clase interna)
        class Higado {
            private String funciónHepática;
            private String tamaño;
            private String estado;

            // Constructor
            public Higado() {
                this.funciónHepática = "Metabolismo";
                this.tamaño = "Normal";
                this.estado = "Funcionando";
            }

            // Getters
            public String getFunciónHepática() {
                return funciónHepática;
            }

            public String getTamaño() {
                return tamaño;
            }

            public String getEstado() {
                return estado;
            }
        }

        // Clase Apendice (clase interna)
        class Apendice {
            private String tamaño;
            private String estado;
            private boolean dolor;

            // Constructor
            public Apendice() {
                this.tamaño = "Pequeño";
                this.estado = "Sano";
                this.dolor = false;
            }

            // Getters
            public String getTamaño() {
                return tamaño;
            }

            public String getEstado() {
                return estado;
            }

            public boolean isDolor() {
                return dolor;
            }
        }
    }

    // Método main
    public static void main(String[] args) {
        // Crear objeto CuerpoHumano
        CuerpoHumano miCuerpo = new CuerpoHumano(30, 170.5, 70.0);

        // Imprimir valores
        System.out.println("Edad: " + miCuerpo.getEdad() + " años");
        System.out.println("Altura: " + miCuerpo.getAltura() + " cm");
        System.out.println("Peso: " + miCuerpo.getPeso() + " kg");

        // Acceder a los órganos del cuerpo humano mediante las clases internas
        CuerpoHumano.Corazon corazon = miCuerpo.new Corazon();
        System.out.println("\nDetalles del corazón:");
        System.out.println("Ritmo cardiaco: " + corazon.getRitmoCardiaco() + " bpm");
        System.out.println("Tamaño: " + corazon.getTamaño());
        System.out.println("Tipo de sangre: " + corazon.getTipoSangre());

        CuerpoHumano.Pulmon pulmon = miCuerpo.new Pulmon();
        System.out.println("\nDetalles del pulmón:");
        System.out.println("Capacidad respiratoria: " + pulmon.getCapacidadRespiratoria() + " ml");
        System.out.println("Tamaño: " + pulmon.getTamaño());
        System.out.println("Estado: " + pulmon.getEstado());

        CuerpoHumano.Apendice apendice = miCuerpo.new Apendice();
        System.out.println("\nDetalles del apéndice:");
        System.out.println("Tamaño: " + apendice.getTamaño());
        System.out.println("Estado: " + apendice.getEstado());
        System.out.println("¿Dolor?: " + (apendice.isDolor() ? "Sí" : "No"));
    }
}

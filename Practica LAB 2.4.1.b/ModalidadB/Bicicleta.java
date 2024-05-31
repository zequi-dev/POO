
public class Bicicleta {
    private String marca;
    private String modelo;
    private int ano;

    public Bicicleta(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Clase anidada Rueda
    public class Rueda {
        private double diametro;

        public Rueda(double diametro) {
            this.diametro = diametro;
        }

        public double getDiametro() {
            return diametro;
        }

        public void setDiametro(double diametro) {
            this.diametro = diametro;
        }
    }

    // Clase anidada Cuadro
    public class Cuadro {
        private String material;

        public Cuadro(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
    }
}

public class Bicicleta {
    // Atributos de Bicicleta
    private String marca;
    private String modelo;
    private int ano;

    // Componentes como clases anidadas
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    // Constructor
    public Bicicleta(String marca, String modelo, int ano, String materialCuadro, double diametroRuedaDelantera, double diametroRuedaTrasera) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cuadro = new Cuadro(materialCuadro);
        this.ruedaDelantera = new Rueda(diametroRuedaDelantera);
        this.ruedaTrasera = new Rueda(diametroRuedaTrasera);
    }

    // Getters y Setters para Bicicleta
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Métodos para acceder a los componentes
    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public Cuadro getCuadro() {
        return cuadro;
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

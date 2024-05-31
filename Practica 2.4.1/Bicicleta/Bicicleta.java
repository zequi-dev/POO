class Bici {
    private String marca;
    private String modelo;
    private String color;
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    public Bici(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ruedaDelantera = new Rueda(26, "Aluminio", "Deportiva");
        this.ruedaTrasera = new Rueda(26, "Aluminio", "Deportiva");
        this.cuadro = new Cuadro("Acero", "M", "Montaña");
    }

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

public class Bicicleta {
    public static void main(String[] args) {
        Bici miBici = new Bici("Trek", "X-Caliber 9", "Negro");

        System.out.println("Marca de la Bici: " + miBici.getMarca());
        System.out.println("Modelo de la Bici: " + miBici.getModelo());
        System.out.println("Color de la Bici: " + miBici.getColor());

        System.out.println("\nDetalles de la rueda delantera:");
        System.out.println("Tamaño: " + miBici.getRuedaDelantera().getTamaño());
        System.out.println("Material: " + miBici.getRuedaDelantera().getMaterial());
        System.out.println("Tipo: " + miBici.getRuedaDelantera().getTipo());

        System.out.println("\nDetalles de la rueda trasera:");
        System.out.println("Tamaño: " + miBici.getRuedaTrasera().getTamaño());
        System.out.println("Material: " + miBici.getRuedaTrasera().getMaterial());
        System.out.println("Tipo: " + miBici.getRuedaTrasera().getTipo());

        System.out.println("\nDetalles del cuadro:");
        System.out.println("Material: " + miBici.getCuadro().getMaterial());
        System.out.println("Tamaño: " + miBici.getCuadro().getTamaño());
        System.out.println("Tipo: " + miBici.getCuadro().getTipo());
    }
}
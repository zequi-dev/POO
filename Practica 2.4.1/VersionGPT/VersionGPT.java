public class VersionGPT {
    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta("Trek", "X-Caliber 9", "Negro");
        Rueda ruedaDelantera = new Rueda(26, "Aluminio", "Deportiva");
        Rueda ruedaTrasera = new Rueda(26, "Aluminio", "Deportiva");
        Cuadro cuadro = new Cuadro("Acero", "M", "Montaña");

        miBicicleta.setRuedaDelantera(ruedaDelantera);
        miBicicleta.setRuedaTrasera(ruedaTrasera);
        miBicicleta.setCuadro(cuadro);

        System.out.println("Detalles de la bicicleta:");
        System.out.println("Marca: " + miBicicleta.getMarca());
        System.out.println("Modelo: " + miBicicleta.getModelo());
        System.out.println("Color: " + miBicicleta.getColor());

        System.out.println("\nDetalles de la rueda delantera:");
        System.out.println("Diámetro: " + miBicicleta.getRuedaDelantera().getDiametro());
        System.out.println("Material: " + miBicicleta.getRuedaDelantera().getMaterial());
        System.out.println("Tipo: " + miBicicleta.getRuedaDelantera().getTipo());

        System.out.println("\nDetalles de la rueda trasera:");
        System.out.println("Diámetro: " + miBicicleta.getRuedaTrasera().getDiametro());
        System.out.println("Material: " + miBicicleta.getRuedaTrasera().getMaterial());
        System.out.println("Tipo: " + miBicicleta.getRuedaTrasera().getTipo());

        System.out.println("\nDetalles del cuadro:");
        System.out.println("Material: " + miBicicleta.getCuadro().getMaterial());
        System.out.println("Tamaño: " + miBicicleta.getCuadro().getTamaño());
        System.out.println("Tipo: " + miBicicleta.getCuadro().getTipo());
    }
}

class Bicicleta {
    private String marca;
    private String modelo;
    private String color;
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    public Bicicleta(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        this.ruedaDelantera = ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        this.ruedaTrasera = ruedaTrasera;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }
}

class Rueda {
    private int diametro;
    private String material;
    private String tipo;

    public Rueda(int diametro, String material, String tipo) {
        this.diametro = diametro;
        this.material = material;
        this.tipo = tipo;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

class Cuadro {
    private String material;
    private String tamaño;
    private String tipo;

    public Cuadro(String material, String tamaño, String tipo) {
        this.material = material;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

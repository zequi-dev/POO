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
    
    public String getTamaño() {
        return tamaño;
    }
    
    public String getTipo() {
        return tipo;
    }
}

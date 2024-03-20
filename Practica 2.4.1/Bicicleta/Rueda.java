class Rueda {
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

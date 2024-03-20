class Apendice {
    private String tamaño;
    private String estado;
    private boolean dolor;

    // Constructor
    public Apendice(String tamaño, String estado, boolean dolor) {
        this.tamaño = tamaño;
        this.estado = estado;
        this.dolor = dolor;
    }

    // Getters y Setters
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
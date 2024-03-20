class Pulmon {
    private int capacidadRespiratoria;
    private String tamaño;
    private String estado;

    // Constructor
    public Pulmon(int capacidadRespiratoria, String tamaño, String estado) {
        this.capacidadRespiratoria = capacidadRespiratoria;
        this.tamaño = tamaño;
        this.estado = estado;
    }

    // Getters y Setters
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
class Higado {
    private String funciónHepática;
    private String tamaño;
    private String estado;

    // Constructor
    public Higado(String funciónHepática, String tamaño, String estado) {
        this.funciónHepática = funciónHepática;
        this.tamaño = tamaño;
        this.estado = estado;
    }

    // Getters y Setters
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
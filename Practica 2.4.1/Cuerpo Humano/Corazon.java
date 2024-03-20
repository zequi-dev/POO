class Corazon {
    private int ritmoCardiaco;
    private String tamaño;
    private String tipoSangre;

    // Constructor
    public Corazon(int ritmoCardiaco, String tamaño, String tipoSangre) {
        this.ritmoCardiaco = ritmoCardiaco;
        this.tamaño = tamaño;
        this.tipoSangre = tipoSangre;
    }

    // Getters y Setters
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

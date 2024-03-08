public class Humano {
    protected String nombre; 
    private int edad; 
    private String genero;
    private String direccion;
    protected String profesion; 

    public Humano(String nombre, int edad, String genero, String direccion, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.profesion = profesion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void comer(String comida) {
        System.out.println("La persona está comiendo " + comida);
    }

    protected void dormir(int horas) {
        System.out.println("La persona está durmiendo durante " + horas + " horas");
    }

    private void Ducha(int hora) {
        System.out.println("La persona está tomando una ducha a las" + hora + "horas");
    }

    public void tomarDucha(int hora) {
        Ducha(hora);
    }
}

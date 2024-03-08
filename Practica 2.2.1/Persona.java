public class Persona {

    private String nombre;
    private int edad;
    private String genero;
    private String direccion;
    private String profesion;

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

    public static void comer(String comida) {
        System.out.println("La persona está comiendo " + comida);
    }
    
    public void dormir(int horas) {
        System.out.println("La persona está durmiendo durante " + horas + " horas");
    }
   
    public void hacerEjercicio(String ejercicio) {
        System.out.println("La persona está haciendo ejercicio de tipo " + ejercicio);
    }
}

public class Persona {

    private String nombre;
    private int edad;
    private String genero;
    private String direccion;
    private String profesion;

    public Persona(String nombre, int edad, String genero, String direccion, String profesion) {
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

    public static void comer(String comida, String nombrePersona) {
        System.out.println(nombrePersona + " está comiendo " + comida);
    }

    public static void comida(String comida, String nombrePersona, int calorias) {
        System.out.println(nombrePersona + " está comiendo " + comida + " La cual aporta " + calorias + " calorias");
    }
    
    public void dormir(int horas, String nombrePersona) {
        System.out.println(nombrePersona + " está durmiendo durante " + horas + " horas");
    }
   
    public void hacerEjercicio(String ejercicio, String nombrePersona) {
        System.out.println(nombrePersona + " está haciendo ejercicio de tipo " + ejercicio);
    }
}

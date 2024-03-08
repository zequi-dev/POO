public class Practica2_1_1_v1 {
    public static void main(String[] args) {
        Estudiante1 est1 = new Estudiante1();
        est1.setNombre("Carlos");
        est1.setEdad(20);
        est1.setMatricula(1290180);
        est1.setSemestre(6);
        System.out.println("Su nombre es: " + est1.getNombre());
        System.out.println("Su edad es: " + est1.getEdad());
        System.out.println("Su matrícula es: " + est1.getMatricula());
        System.out.println("Su semestre es: " + est1.getSemestre());

        Estudiante1 est2 = new Estudiante1();
        est2.setNombre("Humberto");
        est2.setEdad(21);
        est2.setMatricula(1291130);
        est2.setSemestre(7);
        System.out.println("\nSu nombre es: " + est2.getNombre());
        System.out.println("Su edad es: " + est2.getEdad());
        System.out.println("Su matrícula es: " + est2.getMatricula());
        System.out.println("Su semestre es: " + est2.getSemestre());

        Estudiante1 est3 = new Estudiante1();
        est3.setNombre("Kenneth");
        est3.setEdad(23);
        est3.setMatricula(1293133);
        est3.setSemestre(7);
        System.out.println("\nSu nombre es: " + est3.getNombre());
        System.out.println("Su edad es: " + est3.getEdad());
        System.out.println("Su matrícula es: " + est3.getMatricula());
        System.out.println("Su semestre es: " + est3.getSemestre());
    }
}
public class Practica2_1_1_v2 {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        String tempnom = est1.setGetNombre("Carlos");
        int tempedad = est1.setGetEdad(20);
        int tempmat = est1.setGetMatricula(1290180);
        int tempsem = est1.setGetSemestre(6);
        System.out.println("Su nombre es: " + tempnom);
        System.out.println("Su edad es: " + tempedad);
        System.out.println("Su matrícula es: " + tempmat);
        System.out.println("Su semestre es: " + tempsem);

        Estudiante est2 = new Estudiante();
        String tempnom2 = est2.setGetNombre("Humberto");
        int tempedad2 = est2.setGetEdad(21);
        int tempmat2 = est2.setGetMatricula(1291130);
        int tempsem2 = est2.setGetSemestre(7);
        System.out.println("\nSu nombre es: " + tempnom2);
        System.out.println("Su edad es: " + tempedad2);
        System.out.println("Su matrícula es: " + tempmat2);
        System.out.println("Su semestre es: " + tempsem2);

        Estudiante est3 = new Estudiante();
        String tempnom3 = est3.setGetNombre("Kenneth");
        int tempedad3 = est3.setGetEdad(23);
        int tempmat3 = est3.setGetMatricula(1293133);
        int tempsem3 = est3.setGetSemestre(7);
        System.out.println("\nSu nombre es: " + tempnom3);
        System.out.println("Su edad es: " + tempedad3);
        System.out.println("Su matrícula es: " + tempmat3);
        System.out.println("Su semestre es: " + tempsem3);
    }
}
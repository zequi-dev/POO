public class Estudiante {
    String nombre;
    int matricula;
    int edad;
    int semestre;

    String setGetNombre(String nom) {
        nombre = nom;
        return nombre;
    }

    int setGetMatricula(int mat)
    {
        matricula = mat;
        return matricula;
    }

    int setGetEdad(int age)
    {
        edad = age;
        return edad;
    }

    int setGetSemestre(int sem) {
        semestre = sem;
        return semestre;
    }

}

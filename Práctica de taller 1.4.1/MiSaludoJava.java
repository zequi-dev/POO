public class MiSaludoJava {
    public static void main(String[] args) {
        if (args.length > 0) {
            String mensaje = "";
            for (int i = 0; i < args.length; i++) {
                mensaje += args[i] + " ";
            }
            System.out.println("Mensaje recibido: " + mensaje);
        } else {
            System.out.println("No se recibió ningún mensaje.");
        }
        
        System.out.println("Total de argumentos ingresados: " + args.length);
    }
}

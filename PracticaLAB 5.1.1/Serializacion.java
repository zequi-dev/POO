import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializacion {
    public static void guardarObjeto(Object objeto, String archivo) {
        try (FileOutputStream fileOut = new FileOutputStream(archivo);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(objeto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

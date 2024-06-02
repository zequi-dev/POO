import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializacion {
    public static Object leerObjeto(String archivo) {
        try (FileInputStream fileIn = new FileInputStream(archivo);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

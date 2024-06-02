import java.io.Serializable;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    private String idUsuario;
    private String nombre;
    private String email;

    public Usuario(String idUsuario, String nombre, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y setters
}

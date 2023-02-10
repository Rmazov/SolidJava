package baseDatos;

public class MySql {
    private String nombre;
    private String apellido;

    public MySql(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void guardarPersona() {
        System.out.println("nombre persona oracle "+ nombre+ "apellido persona oracle"+apellido);

    }
}

public class Adulto extends Persona{
private String dni;
    private String tarjeta;

    public Adulto(String nombre, String apellido,String dni,String tarjeta) {
        super(nombre, apellido);
        this.dni = dni;
        this.tarjeta = tarjeta;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public void pagar() {
        System.out.println("mi dni es "+ getDni()+ "pago con la tarjeta"+tarjeta);

    }
}

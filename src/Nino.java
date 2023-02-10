public class Nino extends Persona{
private Adulto adulto;
    public Nino(String nombre, String apellido, Adulto adulto) {
        super(nombre, apellido);
        this.adulto= adulto;

    }

    @Override
    public void pagar() {
        System.out.println("el  dni del adulto para la compra es "+ adulto.getDni()+ "pago con la tarjeta"+adulto.getTarjeta());

    }
}

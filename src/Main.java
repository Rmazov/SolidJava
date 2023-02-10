import baseDatos.MySql;
import baseDatos.Oracle;

public class Main {
    public static void main(String[] args) {
       /* Adulto adulto = new Adulto("juan","Perez","4545454",
                "master");
        adulto.pagar();
        Nino nino = new Nino("ricardo","mazo",adulto);
        nino.pagar();*/

        Oracle oracle = new Oracle("nombreOrcle","apellidoOracle");
        oracle.guardarPersona();

        MySql mySql = new MySql("nombreMysql","apellidMysqul");
        mySql.guardarPersona();


    }
}
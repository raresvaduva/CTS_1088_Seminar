package ro.ase.csie.cts.g1088.dp.singleton.registru;

public class TestRegistruSingleton {

    public static void main(String[] args) {

        ConexiuneBD conexiuneBD1 = ConexiuneBD.getConexiune("10.0.0.1","cts");
        ConexiuneBD conexiuneBD2 = ConexiuneBD.getConexiune("10.0.0.1","cts");
        ConexiuneBD conexiuneBD3 = ConexiuneBD.getConexiune("10.0.0.2","ctsTest");

        if(conexiuneBD1 == conexiuneBD2){
            System.out.println("Cele 2 referinte sunt identice");
        }
        else
        {
            System.out.println("Cele 2 referinte sunt diferite");
        }

        if(conexiuneBD1 == conexiuneBD3){
            System.out.println("Cele 2 referinte sunt identice");
        }
        else
        {
            System.out.println("Cele 2 referinte sunt diferite");
        }

    }
}

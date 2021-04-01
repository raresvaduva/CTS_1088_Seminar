package ro.ase.csie.cts.g1088.dp.singleton;

public class TestSingleton {

    public static void main(String[] args) {

        ConexiuneBD conexiuneBD1 = ConexiuneBD.getConexiune();
        ConexiuneBD conexiuneBD2 = ConexiuneBD.getConexiune();

        if(conexiuneBD1 == conexiuneBD2){
            System.out.println("Cele 2 referinte sunt identice");
        }
        else
        {
            System.out.println("Cele 2 referinte sunt diferite");
        }

        ModulUI modulUI = new ModulUI();
        ModulProfil modulProfil = new ModulProfil();
    }
}

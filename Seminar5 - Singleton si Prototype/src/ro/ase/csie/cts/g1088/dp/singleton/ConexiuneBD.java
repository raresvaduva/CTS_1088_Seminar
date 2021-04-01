package ro.ase.csie.cts.g1088.dp.singleton;

public class ConexiuneBD {

    //versiune Eager :
    //private static ConexiuneBD conexiune = new ConexiuneBD("10.0.0.1","cts");

    private static ConexiuneBD conexiune = null;
    String ip;
    String denumire;

    private ConexiuneBD()
    {

    }

    private ConexiuneBD(String ip, String denumire) {
        this.ip = ip;
        this.denumire = denumire;
        System.out.println("Apel Constructor");
    }

    //versiune Lazy
    // synchronized se pune pentru multi thread
    public static synchronized ConexiuneBD getConexiune()
    {
        if(conexiune == null)
        {
            //datele se pot prelua din fisiere de configurare
            conexiune = new ConexiuneBD("10.0.0.1","cts");
        }
        return conexiune;
    }
}

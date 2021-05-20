package ro.ase.csie.cts.g1088.dp.observer;

public class ModulNotificariUI implements InterfataStatusConexiuneServer{
    @Override
    public void conexiuneIntrerupta() {
        System.out.println("Popup: Conexiune pierduta");
    }

    @Override
    public void conexiuneActiva() {
        System.out.println("Conexiune activa)");
    }
}

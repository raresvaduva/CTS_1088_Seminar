package ro.ase.csie.cts.g1088.dp.observer;

public class ModulSalvareAutomata implements InterfataStatusConexiuneServer{
    @Override
    public void conexiuneIntrerupta() {
        System.out.println("Salvare automata server...");
    }

    @Override
    public void conexiuneActiva() {
        System.out.println("Afisare istoric salvari...");

    }
}

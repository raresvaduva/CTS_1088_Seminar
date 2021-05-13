package ro.ase.csie.cts.g1088.dp.chain;

public class TestChain {
    public static void main(String[] args) {

        ModulProcesareMesaj modulFiltru = new ModulFiltruRomana();
        ModulProcesareMesaj modulPrivat = new ModulMesajePrivate();
        ModulProcesareMesaj modulGrup = new ModulMesajeGrup();

        modulFiltru.setNext(modulPrivat);
        modulPrivat.setNext(modulGrup);

        ModulProcesareMesaj serverChat = modulFiltru;

        serverChat.procesareMesaj(new MesajChat("Salut !",3,"@gigel"));
        serverChat.procesareMesaj(new MesajChat("Milbey prostule gay",3,"@gigel"));
        serverChat.procesareMesaj(new MesajChat("g a y",3,"@tudi"));
        serverChat.procesareMesaj(new MesajChat("Salut fratilor!",3,"@everyone"));

    }
}

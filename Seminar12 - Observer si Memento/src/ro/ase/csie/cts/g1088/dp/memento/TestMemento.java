package ro.ase.csie.cts.g1088.dp.memento;

public class TestMemento {
    public static void main(String[] args) {

        SuperErou superman = new SuperErou("Superman",100, "Zboara");
        ManagerIstoric istoric = new ManagerIstoric();

        istoric.adaugaSalvare(superman.salvare());

        System.out.println("Puncte viata: " + superman.puncteViata);
        superman.esteLovit(10);
        superman.esteLovit(50);
        System.out.println("Puncte viata: " + superman.puncteViata);

        superman.incarcaSalvare(istoric.getUltimaSalvare());
        System.out.println("Puncte viata: " + superman.puncteViata);

    }
}

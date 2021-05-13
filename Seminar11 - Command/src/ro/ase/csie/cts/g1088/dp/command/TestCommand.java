package ro.ase.csie.cts.g1088.dp.command;

public class TestCommand {

    public static void main(String[] args) {

        ManagerTaskuri manager = new ManagerTaskuri();

        manager.adaugaTask(new TaskAsincron(new ModulUpdate(), "versiune 10.1",5));
        manager.adaugaTask(new TaskAsincron(new ModulAutoSave(), "Salvare automata nivel...",1));

        System.out.println("Jocul continua...");

        manager.executaUrmatorulTask();

        System.out.println("Jocul continua...");

        manager.executaUrmatorulTask();

        System.out.println("Jocul continua...");
    }
}

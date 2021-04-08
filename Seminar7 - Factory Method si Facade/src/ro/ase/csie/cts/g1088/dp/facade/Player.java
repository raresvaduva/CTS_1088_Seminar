package ro.ase.csie.cts.g1088.dp.facade;

public class Player {

    public void login(ConexiuneServerJoc conexiune) {
        System.out.println("Login Player");
    }

    public ProfilPlayer getProfil() {
        return new ProfilPlayer();
    }

}

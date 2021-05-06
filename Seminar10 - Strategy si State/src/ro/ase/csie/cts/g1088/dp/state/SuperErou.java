package ro.ase.csie.cts.g1088.dp.state;

public class SuperErou {

    public static final int PUNCTE_NIVEL_CRITIC = 50;
    public static final int PUNCTE_NIVEL_NORMAL = 500;
    int puncteViata;
    String efectMagic;
    String nume;
    InterfataModDeplasare modDeplasare = null;

    public SuperErou(String nume) {
        this.puncteViata = PUNCTE_NIVEL_NORMAL;
        this.nume = nume;
        this.modDeplasare = new StareDeplasareNormala();
    }

    public void esteAtacat(int puncteLovitura) {
        System.out.println(this.nume + " este lovit pentru " + puncteLovitura + " de puncte");
        this.puncteViata -= puncteLovitura;

        if (this.puncteViata < PUNCTE_NIVEL_CRITIC) {
            this.modDeplasare = new StareDeplasareRanitCritic();
        } else {
            if (this.puncteViata < PUNCTE_NIVEL_NORMAL) {
                this.modDeplasare = new StareDeplasareRanit();
            }
        }
    }

    public void seVindeca(int puncte) {
        System.out.println(this.nume + " se vindeca pentru " + puncte + " de puncte");
        this.puncteViata += puncte;

        if (this.puncteViata > PUNCTE_NIVEL_NORMAL) {
            this.modDeplasare = new StareDeplasareNormala();
        } else {
            if (this.puncteViata > PUNCTE_NIVEL_CRITIC) {
                this.modDeplasare = new StareDeplasareRanit();
            }
        }
    }

    public void seDeplaseaza() {
        this.modDeplasare.seMisca(this);
    }
//    public void seDeplaseaza() {
//        if puncte viata peste nivel critic
//            atunci se deplaseaza;
//
//        if peste nivel normal
//            atunci alearga
//
//        if sub nivel critic
//            atunci nu se deplaseaza;
//    }
    //state scoate inafara clasei implementarea acestor metode date de conditii diferite


}

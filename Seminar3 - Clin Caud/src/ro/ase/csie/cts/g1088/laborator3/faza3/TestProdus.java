package ro.ase.csie.cts.g1088.laborator3.faza3;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.ServiciuValidari;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.StrategieMarketing2021;

public class TestProdus {

    public static void main(String[] args) {

        Produs produs = new Produs(
                new StrategieMarketing2021(), new ServiciuValidari());

        try {
            float pretFinal = produs.getPretFinal(TipProdus.DISCOUNT,100,12);
            System.out.println("Pretul final este " + pretFinal);
        } catch (ExceptiePretInvalid exceptiePretInvalid) {
            exceptiePretInvalid.printStackTrace();
        } catch (ExceptieVechimeClient exceptieVechimeClient) {
            exceptieVechimeClient.printStackTrace();
        }
    }
}

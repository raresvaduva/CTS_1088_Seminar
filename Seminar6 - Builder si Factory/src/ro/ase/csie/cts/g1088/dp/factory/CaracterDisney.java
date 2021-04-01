package ro.ase.csie.cts.g1088.dp.factory;

public class CaracterDisney extends CaracterAbstract {

    String culoare;
    boolean okPentruCopiiMici = true;

    public CaracterDisney(String rosu, String culoare) {
        this.culoare = culoare;
        this.nume = nume;
    }

    @Override
    public void alearga() {
        System.out.println("Alearga....");
    }

    @Override
    public void sare() {
        System.out.println("Sare...");
    }
}

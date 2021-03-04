package ro.ase.csie.cts.g1088.laborator.modele;

public abstract class  ContBancar extends Cont{
    //clasele mostenite nu trebuiesc definite deoarece ContBancar este tot abstracta

    protected double balanta;
    protected String iban;

    public ContBancar(double balanta, String iban) {
        this.balanta = balanta;
        this.iban = iban;
    }

    @Override
    public double getBalanta()
    {
        return this.balanta;
    }
}

package ro.ase.csie.cts.g1088.laborator.modele;

import ro.ase.csie.cts.g1088.laborator.exceptii.ExcepteFonduriInsuficiente;
import ro.ase.csie.cts.g1088.laborator.exceptii.ExceptieTransferIlegal;
import ro.ase.csie.cts.g1088.laborator.interfete.Profitabil;

public class ContDepozit extends ContBancar implements Profitabil {

    public static final double BALANTA_MINIMA = 100;

    public ContDepozit(String iban)
    {
        super(BALANTA_MINIMA,iban);
    }

    @Override
    public void adaugaDobanda(double procentDobanda) {
        this.balanta *= (1 + procentDobanda/100);
    }

    @Override
    public void alimenteaza(double valoare) {
        this.balanta += valoare;
    }

    @Override
    public void extrage(double valoare) throws ExcepteFonduriInsuficiente {
        if(this.balanta < valoare)
        {
            throw new ExcepteFonduriInsuficiente("Nu ai bani!");
        }
        else
        {
            this.balanta -= valoare;
        }
    }

    @Override
    public void transfer(Cont destinatie, double valoare) throws ExcepteFonduriInsuficiente, ExceptieTransferIlegal {
        if(this == destinatie)
        {
            throw new ExceptieTransferIlegal();
        }
        this.extrage(valoare);
        destinatie.alimenteaza(valoare);
    }
}

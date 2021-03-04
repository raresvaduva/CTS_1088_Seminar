package ro.ase.csie.cts.g1088.laborator.modele;

import ro.ase.csie.cts.g1088.laborator.exceptii.ExcepteFonduriInsuficiente;
import ro.ase.csie.cts.g1088.laborator.exceptii.ExceptieTransferIlegal;

public abstract class Cont
{
    public abstract double getBalanta();
    public abstract void alimenteaza(double valoare);
    public abstract void extrage(double valoare) throws ExcepteFonduriInsuficiente;
    public abstract void transfer(Cont destinatie, double valoare) throws ExcepteFonduriInsuficiente, ExceptieTransferIlegal;
}

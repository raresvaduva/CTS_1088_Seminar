package ro.ase.csie.cts.g1088.laborator.interfete;

public interface Profitabil
{
    // final pe clasa inseamna ca nu mai poate fii derivata
    // final pe metoda inseamna ca nu poate fii suprascrisa
    // final pe atribute inseamna ca nu pot fii modificate

    int MAX_PROCENT_DOBANDA = 5;
    void adaugaDobanda(double procentDobanda);
}

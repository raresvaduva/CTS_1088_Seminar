package ro.ase.csie.cts.g1088.dp.adapter;

import ro.ase.csie.cts.g1088.dp.factory.method.CaracterDisney;
import ro.ase.csie.cts.g1088.dp.factory.method.CaracterJoc;

import java.util.ArrayList;

public class TestAdapter {

    public static void main(String[] args) {

        // colectie caracere existente
        ArrayList<CaracterJoc> caractere = new ArrayList<>();
        caractere.add(new CaracterDisney("Donald"));

        // collectie caractere EA
        ArrayList<InterfataCaracterEA> caractereEA = new ArrayList<>();
        caractereEA.add(new CaracterGenericEA());

        //folosind un adapter
        InterfataCaracterEA caracterEA = new CaracterGenericEA();
        AdapterEA2CaracterJoc adapt = new AdapterEA2CaracterJoc(caracterEA);
        adapt.seDeplaseaza(); //caracterEA sub forma de caracter existent initial

        caractere.add(adapt);



    }
}

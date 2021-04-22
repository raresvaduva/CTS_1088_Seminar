package ro.ase.csie.cts.g1088.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightModel3D implements InterfataFlyweightModel3D {

    public String numeModel;
    List<Integer> puncteModel = new ArrayList<>(); //componenta permanenta, impact mare memorie

    public FlyweightModel3D(String numeModel) {
        this.numeModel = numeModel;
    }

    @Override
    public void afisareEcran(DateEcran date) {
        //aici avem si datele permanente si cele temporare
        System.out.println(
                String.format("Afisare %s la coordonatele %d,%d,%d cu %s",
                numeModel, date.x, date.y, date.z, date.textura));
    }
}

package ro.ase.csie.cts.g1088.dp.prototype;

public class testPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {

        Caracter3D caracter1 = new Caracter3D("model1.3D");
        //Caracter3D caracter2 = new Caracter3D("model1.3D");
       // Caracter3D caracter3 = new Caracter3D("model1.3D");


        Caracter3D caracter2 = (Caracter3D) caracter1.clone();
        Caracter3D caracter3 = (Caracter3D) caracter1.clone();

        System.out.println(caracter1);
        System.out.println(caracter2);
        System.out.println(caracter3);
        System.out.println("Sfarsit");
    }
}

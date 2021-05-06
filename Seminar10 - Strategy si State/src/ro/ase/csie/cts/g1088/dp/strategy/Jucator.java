package ro.ase.csie.cts.g1088.dp.strategy;

public class Jucator {

    int totalOreJucate;
    String nunme;
    int clasaJucator;
    InterfataStrategieMarketing strategieMK = null;

    public Jucator(int totalOreJucate, String nunme, int clasaJucator) {
        this.totalOreJucate = totalOreJucate;
        this.nunme = nunme;
        this.clasaJucator = clasaJucator;
    }

    public int getTotalOreJucate() {
        return totalOreJucate;
    }

    public String getNunme() {
        return nunme;
    }

    public int getClasaJucator() {
        return clasaJucator;
    }

    //metoda obligatorie pentru strategy design pattern
    public void setStrategieMK(InterfataStrategieMarketing strategieMK) {
        this.strategieMK = strategieMK;
    }

    //    public void acordaPuncteBonus(){
//        if(promotiePaste)
//            then x puncte;
//
//        if(promotieBlackFriday)
//            then y puncte;

    //strategy ne ajuta sa scoatem in afara aceste comportamente
//    }

    public void acordaPuncteBonus(){
        if(this.strategieMK != null)
        {
            this.strategieMK.aplicaStrategieBonus(this);
        }
        else
        {
            throw new UnsupportedOperationException();
        }
    }

}

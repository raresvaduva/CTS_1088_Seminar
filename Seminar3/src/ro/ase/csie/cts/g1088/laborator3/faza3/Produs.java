package ro.ase.csie.cts.g1088.laborator3.faza3;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.InterfataMarketing;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.InterfataValidare;

public class Produs {

    InterfataMarketing serviciuMk = null;
    InterfataValidare serviciuValidare = null;


    public float getDiscountFidelitate(int vechimeClientInAni)
    {
        return (vechimeClientInAni > serviciuMk.VECHIME_CLIENT_MAXIMA) ? serviciuMk.DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100;
    }

    public float getPretCuDiscount(float pretInitial, float discount)
    {
        return pretInitial - (discount * pretInitial);
    }

    public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) throws ExceptiePretInvalid, ExceptieVechimeClient {

        serviciuValidare.validarePret(pretInitial);
        serviciuValidare.validareVechimeClient(vechimeClientInAni);

        float pretFinal = 0;
        float discountFidelitate = (tipProdus == TipProdus.NOU) ? 0 : serviciuMk.getDiscountFidelitate(vechimeClientInAni);
        float valoareDiscountTipProdus = 0;

        valoareDiscountTipProdus = getPretCuDiscount(pretInitial, tipProdus.getDiscount());
        pretFinal = valoareDiscountTipProdus *(1 - discountFidelitate);

        return pretFinal;
    }
}
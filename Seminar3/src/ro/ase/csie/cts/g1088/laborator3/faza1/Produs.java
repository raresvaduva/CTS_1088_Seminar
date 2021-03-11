package ro.ase.csie.cts.g1088.laborator3.faza1;

import ro.ase.cts.csie.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.cts.csie.g1088.laborator3.exceptii.ExceptieVechimeClient;

public class Produs {

    public static final int VECHIME_CLIENT_MAXIMA = 10;
    public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;

    public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) throws ExceptiePretInvalid, ExceptieVechimeClient {

        float pretFinal = 0;
        float discountFidelitate = (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100;

        if(pretInitial <= 0)
        {
            throw new ExceptiePretInvalid();
        }

        if(vechimeClientInAni < 0)
        {
            throw new ExceptieVechimeClient();
        }

        switch (tipProdus){
            case NOU:
                pretFinal = pretInitial;
                break;
            case DISCOUNT:
                pretFinal = (pretInitial - (tipProdus.getDiscount() * pretInitial)) - discountFidelitate * (pretInitial - (0.1f * pretInitial));
                break;
            case STOC_LIMITAT:
                pretFinal = (pretInitial - (tipProdus.getDiscount() * pretInitial)) - discountFidelitate * (pretInitial - (0.25f * pretInitial));
                break;
            case VECHI:
                pretFinal = (pretInitial - (tipProdus.getDiscount() * pretInitial)) - discountFidelitate * (pretInitial - (0.35f * pretInitial));
                break;
            default:
                throw new UnsupportedOperationException("Un simbol din enumerare nu este procesat");
            }

        return pretFinal;
    }
}
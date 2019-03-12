package services;

import models.Card;
import models.Tranzactie;

public class ServiciuTranzactii {

    //adaugare tranzactie ( adaugare in lista + recalculare sold)
    public Card adaugaTranzactie(Card card, Tranzactie tranzactie){
        if(card.getSold() > tranzactie.getSuma()){

            //alocare lista noua cu valoarea adaugata

            double soldRamas = card.getSold() - tranzactie.getSuma();
            card.setSold(soldRamas);
        }
        return card;
    }
}

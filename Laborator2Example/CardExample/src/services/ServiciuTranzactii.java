package services;

import models.Card;
import models.Tranzactie;

public class ServiciuTranzactii {

    //adaugare tranzactie ( adaugare in lista + recalculare sold)
    public Card adaugaTranzactie(Card card, Tranzactie tranzactie) {
        int size = card.getTranzactii().length;
        Tranzactie[] tranzactii = new Tranzactie[size + 1];

        if (card.getSold() > tranzactie.getSuma()) {
            //alocare lista noua cu valoarea adaugata

            for (int i = 0; i < size; i++) {
                tranzactii[i] = card.getTranzactii()[i];
            }
            tranzactii[size] = tranzactie;
            card.setTranzactii(tranzactii);

            double soldRamas = card.getSold() - tranzactie.getSuma();
            card.setSold(soldRamas);
        }
        return card;
    }

    //alimentare cont ( adauga tranzactie noua + sold)
}

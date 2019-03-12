package main;

import models.Card;
import models.Titular;
import models.Tranzactie;
import services.ServiciuTranzactii;

public class Main {

    public static void main(String[] args) {

        Titular titular = new Titular("Popescu", 23);
        Tranzactie[] tranzactii = new Tranzactie[3];
        tranzactii[0] = new Tranzactie(20.3,"Carrefour");
        tranzactii[1] = new Tranzactie(20,"Lidl");

        Card card = new Card();
        card.setSold(2000);
        card.setTitular(titular);
        card.setTranzactii(tranzactii);

        System.out.println(card.toString());

        ServiciuTranzactii serviciuTranzactii = new ServiciuTranzactii();
        System.out.println(serviciuTranzactii.adaugaTranzactie(card,
                new Tranzactie(100,"Retragere cash")));
    }
}

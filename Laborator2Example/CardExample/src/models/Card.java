package models;

import java.util.Arrays;

public abstract class Card {

    private Titular titular;
    private Tranzactie[] tranzactii;
    private double sold;

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Tranzactie[] getTranzactii() {
        return tranzactii;
    }

    public void setTranzactii(Tranzactie[] tranzactii) {
        this.tranzactii = tranzactii;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Card{" +
                "titular=" + titular +
                ", tranzactii=" + Arrays.toString(tranzactii) +
                ", sold=" + sold +
                '}';
    }

    public abstract void adaugaTranzactie(Tranzactie tranzactie);
}

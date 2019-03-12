package models;

public class CardDebit extends Card {
    @Override
    public void adaugaTranzactie(Tranzactie tranzactie) {
        int size = this.getTranzactii().length;
        Tranzactie[] tranzactii = new Tranzactie[size + 1];

        if (this.getSold() > tranzactie.getSuma()) {
            //alocare lista noua cu valoarea adaugata
            for (int i = 0; i < size; i++) {
                tranzactii[i] = this.getTranzactii()[i];
            }
            tranzactii[size] = tranzactie;
            this.setTranzactii(tranzactii);

            double soldRamas = this.getSold() - tranzactie.getSuma();
            this.setSold(soldRamas);
            System.out.println(this.getSold());
        }
    }
}

package models;

public class Tranzactie {

    private double suma;
    private String descriere;

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Tranzactie(double suma, String descriere) {
        this.suma = suma;
        this.descriere = descriere;
    }

    public Tranzactie() {
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "suma=" + suma +
                ", descriere='" + descriere + '\'' +
                '}';
    }
}

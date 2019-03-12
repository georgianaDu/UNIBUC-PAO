package models;

public class Titular {

    private String nume;
    private int varsta;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Titular(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public Titular() {
    }

    @Override
    public String toString() {
        return "Titular{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}

package clase;

public class Pisica extends Animal{

    private int varsta;
    private double greutate;

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public Pisica(int varsta, double greutate) {
        this.varsta = varsta;
        this.greutate = greutate;
    }

    public Pisica() {
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "varsta=" + varsta +
                ", greutate=" + greutate +
                '}';
    }

    void comportament (){
        comportament("Miew");
    }

    @Override
    public void comportament2() {

    }
}

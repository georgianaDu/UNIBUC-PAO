package clase;

import java.util.Objects;

public class Pisica extends Animal {
    private String stapan;
    public int varsta = 30;

    public String getStapan() {
        return stapan;
    }

    public void setStapan(String stapan) {
        this.stapan = stapan;
    }

    public void metodeDeAcces() {
        System.out.println(varsta);
    }

    public Pisica() {
        System.out.println("Constructor Pisica");
    }

    public Pisica(int varsta, String stapan){
        super(varsta,null);
        this.stapan = stapan;
    }


    public void afisareSuper(){
        System.out.println(super.varsta);
    }

    public void afisareSuper(int varsta){
        System.out.println(varsta);

    }


    @Override
    public void sunet() {
        System.out.println("Miew");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pisica pisica = (Pisica) o;
        return varsta == pisica.varsta &&
                Objects.equals(stapan, pisica.stapan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stapan, varsta);
    }

    public void verificareHash(){
        System.out.println("Animal " + super.hashCode());
        System.out.println("Pisica "+ this.hashCode());
    }
}

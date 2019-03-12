package clase;

public abstract class Animal {
    protected int varsta;
    private String nume;

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Animal() {
        System.out.println("Constructor Animal");
    }

    public Animal(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

    public abstract void sunet();


    @Override
    public String toString() {
        return "Animal{" +
                "varsta=" + varsta +
                ", nume='" + nume + '\'' +
                '}';
    }

    //regula 1 acelasi identificator, parametru, tip returnat
    @Override
    public boolean equals(Object o) {
        //r2 Daca primeste null returneaza false
        if (o == null) return false;
        if (o instanceof Animal) {
            Animal a = (Animal) o;

            return a.varsta == this.varsta &&
                    a.nume.equals(this.nume);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        int result = 17;

        result = 31 * result + nume.hashCode();
        result = 31 * result + varsta;

        return result;
    }
}

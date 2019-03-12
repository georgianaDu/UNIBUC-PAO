package clase;

public abstract class Animal {
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    protected void comportament(String comportament){
        System.out.println(comportament);
    }

    public abstract void comportament2();
}

package clase;

public class Caine extends Animal {
    private String rasa;

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public Caine() {
        System.out.println("Constructor Caine");
    }

    @Override
    public void sunet(){
        System.out.println("ham");
    }
}

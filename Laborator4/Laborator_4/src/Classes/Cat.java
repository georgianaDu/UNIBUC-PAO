package Classes;

public class Cat extends Animal{
    private String name;
    private String color;

    public Cat ( String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void sayWhoIAm (){
        System.out.println("Hi from cat");
    }
}

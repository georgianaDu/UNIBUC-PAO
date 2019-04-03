import Classes.Cat;
import Classes.Dog;

public class Main {

    public static void main(String[] args) {
        Cat c1 = new Cat ("Mitzi", "alba");
        Dog d1 = new Dog ("Fulger", "negru");

        c1.sayWhoIAm();;
        d1.sayWhoIAm();
    }
}

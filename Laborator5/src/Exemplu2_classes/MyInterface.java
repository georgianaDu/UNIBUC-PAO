package Exemplu2_classes;


@FunctionalInterface
public interface MyInterface {

    public int sum (int a, int b);

    default int sumAgain ( int a, int b){
        return sum (b,a);
    }

    static void saySomething() {
        System.out.println("Say something");
    }
}

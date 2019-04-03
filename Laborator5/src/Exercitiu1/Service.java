package Exercitiu1;

public class Service implements MyInterface {

    @Override
    public int sum(int a, int b) {
        System.out.println(a+b);
        return a+b;
    }

    @Override
    public int diff(int a, int b) {
        return a-b;
    }

    @Override
    public int prod(int a, int b) {
        return a/b;
    }

    @Override
    public int mod(int a, int b) {
        return a%b;
    }
}

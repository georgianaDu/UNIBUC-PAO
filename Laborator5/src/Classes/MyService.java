package Classes;

public class MyService implements MyInterface1, MyInterface2 {
    @Override
    public void saySomething1() {
        System.out.println("Hello from interface 1");
    }

    @Override
    public void saySomething2() {
        System.out.println("Hello from interface 2");
    }
}

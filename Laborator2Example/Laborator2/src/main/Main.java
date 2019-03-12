package main;


import singleton.SingletonObject;

public class Main {

    public static void main(String[] args) {

        SingletonObject singletonObject1 = SingletonObject.getInstance();
        SingletonObject singletonObject2 = SingletonObject.getInstance();
        SingletonObject singletonObject3 = SingletonObject.getInstance();

        System.out.println(singletonObject1.getMesaj());
        System.out.println(singletonObject2.getMesaj());
        System.out.println(singletonObject3.getMesaj());

        System.out.println(singletonObject2.getMesaj());
    }
}

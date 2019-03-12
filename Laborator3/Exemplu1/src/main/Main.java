package main;

import clase.Animal;
import clase.Caine;
import clase.Pisica;

public class Main {

    public static void main(String[] args) {

        Animal a2 = new Caine();
        System.out.println();
        Animal a3 = new Pisica();

        a3.setVarsta(12);
        a3.setNume("Pis");
        Pisica p1 = (Pisica) a3;

        System.out.println(p1.varsta);

        a2.sunet();
        a3.sunet();

        p1.verificareHash();
    }
}

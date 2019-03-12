package main;

import clase.Pisica;
import clase.SingletonClass;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Integer[] arr1 = new Integer[5];
//        arr1[0] = 1;
//        arr1[1] = 3;
//        arr1[2] = 8;
//        arr1[3] = 5;
//        arr1[4] = 4;
//
//        System.out.println(Arrays.asList(arr1));
//        System.out.println(Arrays.binarySearch(arr1, 4));
//        Arrays.sort(arr1);
//        System.out.println(Arrays.asList(arr1));
//
//        int suma = 0;
//        for (Integer integer : arr1) {
//            suma += integer;
//        }
//        System.out.println("Suma: "+ suma);

        SingletonClass s = SingletonClass.getInstance();
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        s.setS(s.getS().toUpperCase());
        System.out.println(s.getS());
        System.out.println(s1.getS());
        System.out.println(s2.getS());

        s2.setS(s.getS().toLowerCase());
        System.out.println(s.getS());
        System.out.println(s1.getS());
        System.out.println(s2.getS());

    }

    private static void afisare(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i + ": " + arr1[i]);
        }
    }
}
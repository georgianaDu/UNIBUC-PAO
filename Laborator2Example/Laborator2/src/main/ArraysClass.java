package main;

import java.util.Arrays;
import java.util.List;

public class ArraysClass {

    public static void main(String[] args) {
        int[] array1 = {34, 49, 24, 1};
        Integer[] arrayInteger = {3, 9, 24, 1};

    //    System.out.println(Arrays.asList(array1));
        System.out.println(Arrays.asList(arrayInteger));

        List<Integer> integerList = Arrays.asList(arrayInteger);
        System.out.println(integerList);

        Arrays.sort(array1);

        System.out.println(Arrays.binarySearch(array1, 49));
    }
}

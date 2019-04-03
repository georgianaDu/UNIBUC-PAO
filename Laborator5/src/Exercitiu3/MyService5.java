package Exercitiu3;

import java.util.Arrays;

public class MyService5 implements MyInterface5 {

    private int[] arr = new int[0];
    @Override
    public void addElements(int a) {
        int arr1[] = new int[arr.length + 1];

        for ( int i = 0; i < arr.length; i++)
            arr1[i] = arr[i];
        arr1[arr.length] = a;

        arr = arr1;
    }

    @Override
    public void getElements() {
        for ( int i = 0 ; i < arr.length; i++ )
            System.out.println(arr[i]);
    }

    public int [] addNewElementToArray (int newElement){
        int [] tmp = Arrays.copyOf( arr , arr.length + 1);
        tmp[tmp.length -1] = newElement;
        return tmp;

    }
}

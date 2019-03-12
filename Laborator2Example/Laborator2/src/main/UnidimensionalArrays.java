package main;

public class UnidimensionalArrays {

    public static void main(String[] args) {
        int[] firstArray = new int[3];
        int[] secondArray = new int[]{5, 20, 34, 12};
        int[] thirdArray = {4, 29, 12};

        firstArray[0] = 4;
        firstArray[1] = 31;

        System.out.println(firstArray);

        afisare(firstArray);
        afisare(secondArray);
        afisare(firstArray);
        //suma numerelor dintr-un array
    }

    public static void afisare(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}

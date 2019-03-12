package main;

public class BidimentionalArrays {

    public static void main(String[] args) {
        int[][] bidimarray1 = new int[2][3];
        int[][] bidimArray2 = {{23, 45, 50}, {12, 94, 12}};
        int[][] bi = new int[3][];

        bidimarray1[0][0] = 3;
        bidimarray1[0][1] = 4;
        bidimarray1[0][2] = 45;
        bidimarray1[1][0] = 3;
        bidimarray1[1][1] = 4;
        bidimarray1[1][2] = 23;
        System.out.println("Linii " + bidimarray1.length);
        System.out.println("Coloane " + bidimarray1[1].length);

        afisare(bidimArray2);
    }

    public static void afisare(int[][] bidimArray) {
        for (int i = 0; i <= bidimArray.length; i++) {
            for (int j = 0; j < bidimArray[i].length; j++) {
                System.out.print(bidimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

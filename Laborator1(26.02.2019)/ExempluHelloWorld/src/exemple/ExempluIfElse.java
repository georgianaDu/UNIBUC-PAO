package exemple;

import java.util.Scanner;

public class ExempluIfElse {
    public static void main(String[] args) {
        System.out.println("Introduceti o varsta: ");
        Scanner scanner = new Scanner(System.in);
        int varsta = scanner.nextInt();

        //Exemplu if
        if (varsta < 12) {
            System.out.println("Persoana are mai putin de 12 ani " + varsta);
        } else if (varsta < 20) {
            System.out.println("Varsta este cuprinsa intre 12 si 20 " + varsta);
        } else {
            System.out.println("Nici o conditie nu este respectata");
        }
    }
}

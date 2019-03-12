package exemple;

public class ExempluSwitch {

    public static void main(String[] args) {

        int clasa = 3;

        switch (clasa) {
            case 3:
                System.out.println("Copilul este in clasa a 3-a");
                break;
            case 8:
                System.out.println("Copilul este in clasa a 8-a");
                break;
            case 12:
                System.out.println("Este in an terminal");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}

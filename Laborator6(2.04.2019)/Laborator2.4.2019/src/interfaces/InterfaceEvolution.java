package interfaces;

public interface InterfaceEvolution {

    //1.7
    //atribute constante
    //metode abstracte

    String atributConst = "Acest atribut este constant";
    void afiseazaUnMesaj();

    //1.8
    //1.7 + metode default cu comportament

    default void afisareMesajMetodaDefault(){
        System.out.println(atributConst);
    }

    //1.9
    //metode private
//    private void initializare(){
//
//    }
}

import Classes.MyService;
import Exceptii.MyService6;
import Exercitiu1.Service;
import Exercitiu3.MyService5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        MyService myService = new MyService();

        myService.saySomething1();
        myService.saySomething2();

        /**
         * interfata calculator =>
         * 4 metode abstracte (sum, ( int a , int b ) , diff, mult, divide)
         * service => implementeze calculator
         *
         */

        Service service = new Service();

        //service.sum(10, 20);

        ///////// Exemplu 2

        Exemplu2_classes.MyService myService2= new Exemplu2_classes.MyService();
        //System.out.println(myService2.sum(3,4));
        //System.out.println(myService2.sumAgain(4,7));

        ///////// Exemplu3 -> expresii lanbda

        List<Integer> myIntegerList = Arrays.asList(1,2,3,4,5);
        myIntegerList.stream()
                //.forEach(element -> System.out.print(element));
                .forEach(System.out::print); // la fel

        int sum = myIntegerList.stream()
                .filter(element-> element % 2 == 0) // afiseaza-mi doar elementele pare
                .reduce(0, (a,b) -> a+b); // operatie terminala

        List<Integer> mySecondList = myIntegerList.stream()
                //.filter(element-> element % 2 == 0) // afiseaza-mi doar elementele pare
                .map(element-> element * 2)
                .collect(Collectors.toList());
        mySecondList.forEach(System.out::println);


        //System.out.println(sum);

        ////// Exercitiu 3

        /**
         * interface => addElementToArray
         *          => getElements
         * myService => contine array => implements Interfata
         *
         */

        MyService5 service5 = new MyService5();
        service5.addElements(1);
        service5.addElements(2);
        service5.addElements(3);
        service5.addElements(4);
        service5.addElements(5);
        service5.addElements(6);

        service5.getElements();

        // Exceptii

        String filePath = "C:\\Users\\maria\\IdeaProjects\\Laborator5";


    }
}

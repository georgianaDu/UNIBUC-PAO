package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListTypes {

    List<String> stringList = new ArrayList<>();
    String[] str = {"1", "2"};
    List<String> stringArrayList = Arrays.asList(str);

    LinkedList<String> linkedList = new LinkedList<>();

    public void addValuesToList() {
        stringList.add("1");
        stringList.add(1, "3");
        stringList.addAll(stringArrayList);

        stringList.remove("1"); // sterge obiect
        stringList.remove(3);

        stringList.clear();

        stringList.contains("1");
        stringList.get(2);

        linkedList.addFirst("Fist");
        linkedList.addLast("Last");
    }

    public static void workWithCard() {
        Card card = new Card("Card1", 34.5);
        Card card1 = new Card("Card2", 309);
        Card card3 = new Card("Card3", 1653);

        List<Card> cards = new ArrayList<>();
        cards.add(card);
        cards.add(card1);
        cards.add(card3);

        System.out.println(cards);

        if (!cards.isEmpty()) {
            cards.remove(card1);
        }

        if(cards.contains(card3)){
            System.out.println("Found: "+card3);
        }
        System.out.println(cards);
        for(Card c: cards){
            //implementare
        }

        cards.forEach(c -> System.out.println(c));
        cards.forEach(System.out::println);
        //read file
    }
}

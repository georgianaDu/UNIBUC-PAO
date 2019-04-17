package main;

import lists.Card;

import java.util.*;

public class MainSet {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        SortedSet<String> stringSortedSet = new TreeSet<>();

        stringSet.add("dad");
        stringSet.add("acd");
        stringSet.add("bad");
        stringSet.add("bads");

        stringSortedSet.add("6");
        stringSortedSet.add("5");
        stringSortedSet.add("4");

//        System.out.println(stringSet);
//        System.out.println(stringSortedSet);
//
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(34,"Value34");
        hashMap.put(20,"Value20");
        hashMap.put(10,"Value10");
        hashMap.put(43,"Value43");
        System.out.println(hashMap);

        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);


        Map<Card, String> treeMapCard = new TreeMap<>();

        treeMapCard.put(new Card("Card1", 23),"card 1");
        treeMapCard.put(new Card("Card2", 14),"card 2");
        treeMapCard.put(new Card("Card3", 56),"card 3");

        System.out.println(treeMapCard);

    }


}

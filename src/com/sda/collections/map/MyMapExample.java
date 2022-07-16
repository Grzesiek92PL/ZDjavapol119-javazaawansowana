package com.sda.collections.map;

import java.util.*;

public class MyMapExample {

    public static void main(String[] args) {


        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("Jacek", 20);
        myMap.put("Mateusz", 31);
        myMap.put("Tadeusz", 15);
        myMap.put("Eliza", 45);
        myMap.put("Hanna", 7);

        System.out.println("Wyświetlenie zawartości");
        for (Map.Entry<String, Integer> pair : myMap.entrySet()) {
            System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
        }

        System.out.println("Metody z Map");
        System.out.println(myMap.get("Hanna"));
        System.out.println(myMap.put("Hanna", 17));
        System.out.println(myMap.get("Hanna"));

        System.out.println(myMap.put("Jakub", 100));

        System.out.println("Metody z map");
        System.out.println(myMap.containsKey("Eliza"));
        System.out.println(myMap.containsValue(17));
        System.out.println(myMap.getOrDefault("Piotr", 0));
        System.out.println(myMap.get("Piotr"));

        Map<Integer, Integer> duplicateCounter = new HashMap<>();
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 17, 17, 20, 11, 11, 3, 1, 1);

        for (Integer number : numbers) {
            if (duplicateCounter.get(number) == null) {
                duplicateCounter.put(number, 1);
            } else {
                int counter = duplicateCounter.get(number) + 1;
                duplicateCounter.put(number, counter);
            }
        }

        System.out.println("Rozwiązanie zadania");
        for (Map.Entry<Integer, Integer> pair : duplicateCounter.entrySet()) {
            System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
        }
    }
}

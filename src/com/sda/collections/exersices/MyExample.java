package com.sda.collections.exersices;

import java.util.*;

public class MyExample {

    public static void main(String[] args) {

        Set<Integer> set_1 = new HashSet<>();
        Set<Integer> set_2 = new HashSet<>();

        Random random = new Random();

        Map<String, Integer> map_1 = new HashMap<>();
        Map<String, Integer> map_2 = new HashMap<>();

        System.out.println("SETS");
        System.out.println("RANDOMS");
        for (int i = 0; i < 100; i++) {
            int result = random.nextInt(1001);
            System.out.print(result + " ");
            set_1.add(result);
            set_2.add(result);
            map_1.put(String.valueOf(result), result);
            map_2.put(String.valueOf(result), result);
        }

        System.out.println(" ");
        System.out.println("Zawartość Setów ");
        for (Integer i : set_1) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for (Integer i : set_2) {
            System.out.print(i + " ");
        }

        System.out.println(" ");


        System.out.println(" ");
        System.out.println(" ");
        System.out.println("MAPS");
        map_1.forEach((k, v) -> System.out.print("key: " + k + ", value:" + v + " | "));
        System.out.println(" ");
        map_2.forEach((k, v) -> System.out.print("key: " + k + ", value:" + v + " | "));

        map_1.forEach((k, v) -> System.out.print("hash:" + k.hashCode() + " " ));

    }
}

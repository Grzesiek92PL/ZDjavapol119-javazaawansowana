package com.sda.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyListExample {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(111);
        myList.add(20);
        myList.add(11);
        myList.add(1);
        myList.add(Integer.valueOf(10));
        myList.add(Integer.valueOf("100"));
        myList.add(20);

        for (Integer element : myList) {
            System.out.println(element);
        }

        System.out.println("Wyszukiwanie elemntów po indexie");
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(4));
        System.out.println(myList.get(6));
        int myIndex = 5;
        if (myIndex < myList.size()) {
            System.out.println(myList.get(myIndex));
        }

        System.out.println("Metody z List");
        System.out.println(myList.size());

        System.out.println(myList.contains(10));
        System.out.println(myList.contains(55));

        myList.sort(Integer::compareTo);
        System.out.println("List posortowana rosnąco");
        for (Integer element : myList) {
            System.out.println(element);
        }

        myList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o2 > o1) {
                    return 1;
                } else if (o2 < o1) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        //Podobnie jak powyżej - krótsza implementacja
        myList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println("List posortowana malejąco");
        for (Integer element : myList) {
            System.out.println(element);
        }
    }
}

package com.sda.collections.list;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedLIstExample {

    public static void main(String[] args) {

        List<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("My Name");
        myLinkedList.add("John");
        myLinkedList.add("Kate");
        myLinkedList.add("Patricia");
        myLinkedList.add("Morty");

        System.out.println("Metody dla LinkedList");
        System.out.println(myLinkedList.size());
        //Mało wydajne rozwiązanie
        System.out.println(myLinkedList.get(3));
        //Mało wydajne rozwiązanie
        System.out.println(myLinkedList.remove(4));
        System.out.println(myLinkedList.size());

        for (String element : myLinkedList) {
            System.out.println(element);
        }

        myLinkedList.add(4, "New Element");
        myLinkedList.add("Add");


    }
}

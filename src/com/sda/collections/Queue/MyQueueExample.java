package com.sda.collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueueExample {

    public static void main(String[] args) {

        Queue<String> myQue = new PriorityQueue<>();

        myQue.add("zzzz");
        myQue.add("bbbb");
        myQue.add("aaaa");
        myQue.add("dddd");
        myQue.add("oooo");

        for(String elem : myQue) {
            System.out.println(elem);
        }


        System.out.println(" ");
        myQue.remove();

        for(String elem : myQue) {
            System.out.println(elem);
        }

        System.out.println("");
        System.out.println("DEQUE");
        Deque<String> myDeque = new ArrayDeque<>();

        myDeque.add("Basia");
        myDeque.add("Andrzej");
        myDeque.add("Zosia");
        myDeque.add("Janusz");
        myDeque.add("Tadeusz");

        for (String name : myDeque) {
            System.out.println(name);
        }



    }
}

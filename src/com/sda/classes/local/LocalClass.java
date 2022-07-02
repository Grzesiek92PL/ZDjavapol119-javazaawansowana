package com.sda.classes.local;

public class LocalClass {

    public static void createPair(int x, int y) {
        class Pair {
            int firstNumber;
            int secondNumber;

            Pair(int a, int b) {
                if (a <= b) {
                    firstNumber = a;
                    secondNumber = b;
                } else {
                    firstNumber = b;
                    secondNumber = a;
                }
            }
        }

        Pair pair  = new Pair(x, y);
        System.out.println(pair.firstNumber);
        System.out.println(pair.secondNumber);
    }
}

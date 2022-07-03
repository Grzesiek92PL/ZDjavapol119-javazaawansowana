package com.sda.generics.exercises;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        GenericArrayCounter<Integer> myTest = new GenericArrayCounter<>();

        Integer[] array = {1, 10, 5, -10, 17, 23 ,11};
        Predicate<Integer> myPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 10) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        System.out.println(myTest.countIf(array, myPredicate));

    }
}

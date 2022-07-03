package com.sda.generics.exercises;

import java.util.function.Predicate;

public class GenericArrayCounter<T> {

    public int countIf(T[] array, Predicate<T> predicate) {
        int counter = 0;
        for (T element : array) {
            if (predicate.test(element)) {
                counter++;
            }
        }
        return counter;
    }
}

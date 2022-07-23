package com.sda.new_in_java_8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamIntegerExample {

    public static void main(String[] args) {

        List<Integer> myIntegerList = List.of(100, 10, 11, 1, 0, 15, 16, 18, 20, 51, 49, 38, 61);

        List<Integer> sortedIntegerList = myIntegerList.stream()
                .sorted()
                .collect(Collectors.toList());

        sortedIntegerList.forEach(System.out::println);

        Double average = myIntegerList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Średnia");
        System.out.println(average);
    }
}

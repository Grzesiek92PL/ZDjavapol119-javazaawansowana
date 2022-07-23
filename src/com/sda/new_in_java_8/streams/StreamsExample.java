package com.sda.new_in_java_8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {


    public static void main(String[] args) {

        List<String> stringList = List.of("Daniel", "Mateusz", "Jadwiga", "Paulina", "Edward", "Anna", "Beata", "Zygmunt");

        stringList.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);

        List<String> result = stringList.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println("\n Wynika sortowania \n");
        result.forEach(System.out::println);


        List<Integer> hashCodes = stringList.stream()
                .map(String::hashCode)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\n Hash code'y \n");
        hashCodes.forEach(System.out::println);

        Map<String, Integer> myMap_1 = stringList.stream()
                .collect(Collectors.toMap(String::new, String::hashCode));


        hashCodes.forEach(System.out::println);

        System.out.println("\n Para String -> HashCode \n");
        myMap_1.forEach((k, v) -> System.out.println(k + " -> " + v));

    }
}

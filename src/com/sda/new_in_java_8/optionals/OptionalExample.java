package com.sda.new_in_java_8.optionals;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<String> optional_1 = Optional.of("My Optional");

        System.out.println(optional_1.isPresent());
        System.out.println(optional_1.isEmpty());

        optional_1.ifPresent(System.out::println);

        System.out.println(" ");

        optional_1 = Optional.ofNullable(null);

        System.out.println(optional_1.isPresent());
        System.out.println(optional_1.isEmpty());

        optional_1.ifPresent(System.out::println);

    }
}

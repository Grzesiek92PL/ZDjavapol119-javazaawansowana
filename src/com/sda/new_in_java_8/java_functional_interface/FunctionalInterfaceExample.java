package com.sda.new_in_java_8.java_functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> new String("My Supplier");
        System.out.println(stringSupplier.get());

        Function<String, Integer> parse = (number) -> Integer.parseInt(number);
        System.out.println(parse.apply("100"));

        parse = Integer::parseInt;
        System.out.println(parse.apply("200"));

        //Zapisy są równoznaczne
        Consumer<String> consumer = s -> System.out.println(s);
        System.out.println(consumer.getClass().getName());

        consumer = System.out::println;
        System.out.println(consumer.getClass().getName());

        consumer = consumer.andThen(s -> System.out.println(s + " " + s));

        consumer.accept("Consumer");
        System.out.println(consumer.getClass().getName());
    }
}

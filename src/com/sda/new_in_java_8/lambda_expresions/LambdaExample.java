package com.sda.new_in_java_8.lambda_expresions;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello");
        r.run();

        MySAMExample mySAMExample_1 = (x, y) -> System.out.println("Wynik: " + (x + y));
        MySAMExample mySAMExample_2 = (x, y) -> System.out.println("Wynik: " + (x - y));
        mySAMExample_1.doSomething(1, 2);
        mySAMExample_2.doSomething(6, 4);

        mySAMExample_1 = (x, y) -> System.out.println("Wynik: " + (x * y));
        mySAMExample_1.doSomething(4, 5);

        IntegerSAMExample integerSAMExample = (x, y) -> {
            IntegerSAMExample.printSomething();
            return x / y;
        };

        System.out.println(integerSAMExample.calculate(100, 10));

        integerSAMExample = Integer::sum;
        System.out.println(integerSAMExample.calculate(1, 1));
    }
}

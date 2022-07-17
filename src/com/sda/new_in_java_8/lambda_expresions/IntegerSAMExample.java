package com.sda.new_in_java_8.lambda_expresions;

public interface IntegerSAMExample {

    int calculate(int x, int y);

    static void printSomething() {
        System.out.println("Default method");
    }

    default void doSomething() {

    }
}

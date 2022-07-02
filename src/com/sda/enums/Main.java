package com.sda.enums;

public class Main {

    public static void main(String[] args) {

        Coffee[] enumValues = Coffee.values();

        for (Coffee coffee : enumValues) {
            System.out.print(coffee + " ");
            System.out.println(coffee.ordinal());
        }

        System.out.println(Coffee.valueOf("AMERICAO"));
        Coffee someCoffee = Coffee.CAPPUCINO;
        System.out.println(someCoffee.getMilk());
        someCoffee.setMilk(100);
        System.out.println(someCoffee.getMilk());

        SomeEnum one = SomeEnum.ONE;
    }
}

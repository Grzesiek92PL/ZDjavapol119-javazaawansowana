package com.sda.oop;

import com.sda.oop.easy.Honda;

public class Main {

    public static void main(String[] args) {

        Honda honda = new Honda("some vin", "Civic", "black");

        System.out.println(honda.getColor());
        honda.runEngine();

        honda.setColor("red");
        System.out.println(honda.getColor());

        System.out.println(honda.toString());
    }
}

package com.sda.oop;

import com.sda.oop.easy.Fiat;
import com.sda.oop.easy.Honda;

public class Main {

    public static void main(String[] args) {

        Honda honda_1 = new Honda("some vin", "Civic", "black");

        Honda honda_2 = new Honda("some vin 2", "Civic", "black");

        System.out.println(honda_1.getColor());
        honda_1.runEngine();

        honda_1.setColor("red");
        System.out.println(honda_1.getColor());

        System.out.println(honda_1.toString());

        //hashcode
        System.out.println(honda_1.hashCode());
        honda_1.setColor("black");
        System.out.println(honda_1.hashCode());

        //equals
        System.out.println(honda_1.equals(honda_2));
        System.out.println(honda_2.equals(honda_1));
        System.out.println(honda_1.equals(honda_1));
        System.out.println(honda_1.equals(null));

        Fiat fiat = new Fiat("vin 3", "Punto", "white");
        System.out.println(honda_1.equals(fiat));


    }
}

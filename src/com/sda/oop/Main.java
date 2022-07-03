package com.sda.oop;

import com.sda.oop.easy.Fiat;
import com.sda.oop.easy.Honda;

import java.util.Arrays;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

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

        Point2D point2D_1 = new Point2D(1, 2);
        Point2D point2D_2 = new Point2D(5, 8);
        Point2D point2D_3 = new Point2D(5, 11);
        Point2D point2D_4 = new Point2D(10, 15);

        System.out.println(point2D_1.compareTo(point2D_2));

        Point2D[] pointsArray = new Point2D[4];
        pointsArray[0] = point2D_1;
        pointsArray[1] = point2D_2;
        pointsArray[2] = point2D_3;
        pointsArray[3] = point2D_4;
        Arrays.sort(pointsArray);
        for(Point2D point : pointsArray) {
            System.out.println(point);
        }

    }
}

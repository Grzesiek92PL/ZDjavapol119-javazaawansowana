package com.sda.oop.exercices.point2d;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
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

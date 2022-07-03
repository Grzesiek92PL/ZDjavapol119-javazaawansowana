package com.sda.oop.exercices.enums;

public class Main {

    public static void main(String[] args) {
        PackageSize packageSize = PackageSize.getPackedSize(1 , 5);

        System.out.println(packageSize);
    }
}

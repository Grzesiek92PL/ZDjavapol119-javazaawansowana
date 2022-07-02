package com.sda.oop.easy;

public class Fiat extends Car {

    private final String model;

    public Fiat(String vin, String model, String color) {
        super(vin, color);
        this.model = model;
    }

    @Override
    void runEngine() {

    }
}

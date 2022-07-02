package com.sda.oop.easy;

public class Honda extends Car {

    private final String model;


    public Honda(String vin, String model, String color) {
        super(vin, color);
        this.model = model;
    }

    @Override
    public void runEngine() {
        System.out.println("Wrrrr, wrrr Honda " + model + " engine is working");
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Honda{" +
                "model='" + model + '\'' +
                "vin=' " + this.getVin() + '\'' +
                ", color=' " + this.getColor() + '\'' +
                "} ";
    }
}

package com.sda.oop.easy;

public abstract class Car {

    private final String vin;
    private String color;

    public Car(String vin, String color) {
        this.vin = vin;
        this.color = color;
    }

    abstract void runEngine();

    public String getColor() {
        return color;
    }

    public String getVin() {
        return vin;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

package com.sda.oop.easy;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(vin, car.vin) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, color);
    }
}

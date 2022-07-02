package com.sda.oop.easy;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Honda honda = (Honda) o;
        return Objects.equals(model, honda.model) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, this.getVin(), this.getColor());
    }
}

package com.sda.oop.exercices.circle;

public class Circle implements GeometricObject, ResizableCircle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void resize(int percent) {
        this.radius = this.radius * percent / 100.0f;
    }
}

package com.sda.oop;

public class Point2D implements Comparable<Point2D> {

    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", this.x, this.y);
    }


    @Override
    public int compareTo(Point2D o) {
        if (this.getX() < o.getX()) {
            return -1;
        } else if (this.getX() > o.getX()) {
            return 1;
        } else {
            return 0;
        }

    }
}

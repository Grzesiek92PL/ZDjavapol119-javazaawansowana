package com.sda.reflection;

public class MyExampleClass {

    private final boolean isObject = true;
    private int someNumber = 0;

    public MyExampleClass() {
    }

    private boolean isObject() {
        return isObject;
    }

    public void setSomeNumber(Integer someNumber) {
        this.someNumber = someNumber;
    }

    public int getSomeNumber() {
        return someNumber;
    }
}

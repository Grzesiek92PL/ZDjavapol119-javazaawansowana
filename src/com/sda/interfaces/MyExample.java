package com.sda.interfaces;

public class MyExample implements MyInterfaceExample {

    @Override
    public void printSomething() {
        System.out.println("Say Hello");
    }

    public void myClassMethod() {
        System.out.println("My class method");
    }

    @Override
    public void print() {
        System.out.println("Override method form interface");;
    }
}

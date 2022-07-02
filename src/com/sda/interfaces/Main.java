package com.sda.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.size();
        list = new ArrayList<>();
        list.size();

        MyInterfaceExample myInterfaceExample = new MyExample();

        myInterfaceExample.printSomething();

        MyExample myExample = (MyExample) myInterfaceExample;
        myExample.printSomething();
        myExample.myClassMethod();

        System.out.println(MyInterfaceExample.size);
        myInterfaceExample.print();
        System.out.println(MyInterfaceExample.getSize());
    }
}

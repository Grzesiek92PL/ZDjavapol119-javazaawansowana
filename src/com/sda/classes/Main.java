package com.sda.classes;

import com.sda.classes.inner.Outer;
import com.sda.classes.local.LocalClass;

public class Main {

    public static void main(String[] args) {

        Outer.NestedStatic nestedStatic = new Outer.NestedStatic();

        //wywołanie na rzecz obiektu
        nestedStatic.saySomething_1();
        //wywołanie na rzecz klasy
        Outer.NestedStatic.saySomething_2();


        //inner class example
        Outer outer = new Outer();
        Outer.Inner inner_1 = outer.new Inner();
        Outer.Inner inner_2 = new Outer().new Inner();

        //local class example
        LocalClass.createPair(-20, -15);
    }
}

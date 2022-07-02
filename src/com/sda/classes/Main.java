package com.sda.classes;

import com.sda.classes.inner.Outer;

public class Main {

    public static void main(String[] args) {

        Outer.NestedStatic nestedStatic = new Outer.NestedStatic();

        //wywołanie na rzecz obiektu
        nestedStatic.saySomething_1();
        //wywołanie na rzecz klasy
        Outer.NestedStatic.saySomething_2();



        Outer outer = new Outer();
        Outer.Inner inner_1 = outer.new Inner();

        Outer.Inner inner_2 = new Outer().new Inner();






    }
}

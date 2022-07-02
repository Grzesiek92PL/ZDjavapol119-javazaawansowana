package com.sda.classes.inner;

public class Outer {

    private static final int x = 10;
    private final String greetings = "Hello";

    public static class NestedStatic {

        private final int y = 15;

        public NestedStatic() {

        }

        public void saySomething_1() {
            System.out.println(x);
            System.out.println(y);

        }

        public static void saySomething_2() {
            System.out.println(x);
            //System.out.println(greetings);

        }

    }

    public class Inner {

        private boolean isInner = true;

        public Inner() {
        }

        public void saySomething() {
            System.out.println(greetings);
            System.out.println(x);
        }

    }
}

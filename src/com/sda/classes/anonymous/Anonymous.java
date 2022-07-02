package com.sda.classes.anonymous;

public class Anonymous {

    public static void main(String[] args) {
        AnonymousExample anonymousExample = new AnonymousExample() {
            @Override
            public void sayHello() {
                System.out.println("Good morning");
            }
        };

        anonymousExample.sayHello();
        System.out.println(anonymousExample.getClass().getName());

    }
}

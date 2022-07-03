package com.sda.generics;

public class Main {

    public static void main(String[] args) {
//        Nie działa z powodu dodania ograniczenia dla typu generycznego
//        Cup<Object> objectCup = new Cup<>(new Object());
//        objectCup.drink();

        Cup<Tea> teaCup = new Cup<>(new Tea());
        teaCup.drink();

        Coffee coffee = new Coffee();
        Cup<Coffee> coffeeCup = new Cup<>(coffee);
        coffeeCup.drink();

        Cup<Tea> new_1 = coffeeCup.fullFillCup(new Tea());
        Cup<Coffee> new_2 = teaCup.fullFillCup(new Coffee());

        new_1.drink();
        new_2.drink();

        Cup<? super Liquid> cup = new Cup<>(new Tea());
        cup = new Cup<>(new Coffee());
    }
}

package com.sda.generics;

public class Cup<T extends Liquid> {

    private final T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    public void drink() {
        System.out.println("Drinking " + liquid);
    }

    public <T extends Liquid> Cup<T> fullFillCup(T liquid) {
        return new Cup<>(liquid);
    }

//    CIEKAWOSTKA!!!
//    public static <T> Cup<T> fullFillCup(T liquid) {
//        return new Cup<>(liquid);
//    }
}

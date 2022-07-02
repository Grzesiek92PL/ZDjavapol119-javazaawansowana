package com.sda.composition;

public class Room {

    private TV tv;
    private Bed bed;

    public Room(TV tv, Bed bed) {
        this.tv = tv;
        this.bed = bed;
    }

    public void showAsortiment() {
        System.out.println("This room has " + tv.getClass().getName() + " with " + tv.getSize() + " size");

    }


}

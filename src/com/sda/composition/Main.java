package com.sda.composition;

public class Main {
    public static void main(String[] args) {

        TV tv = new TV("Full HD", 50);
        Bed bed = new Bed("bed", "huge bedroom");

        Room room = new Room(tv, bed);
        room.showAsortiment();
    }
}

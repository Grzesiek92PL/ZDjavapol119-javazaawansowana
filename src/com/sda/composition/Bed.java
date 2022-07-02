package com.sda.composition;

public class Bed {

    private String name;
    private String bedroom;

    public Bed(String name, String bedroom) {
        this.name = name;
        this.bedroom = bedroom;
    }

    public String getName() {
        return name;
    }

    public String getBedroom() {
        return bedroom;
    }
}

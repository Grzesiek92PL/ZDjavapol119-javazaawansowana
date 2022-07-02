package com.sda.composition;

public class TV {

    private String type;
    private int size;

    public TV(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
}

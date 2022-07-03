package com.sda.adnotations;


public class Adnotation {

    private String name;

    public Adnotation(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Adnotation{" +
                "name='" + name + '\'' +
                '}';
    }
}

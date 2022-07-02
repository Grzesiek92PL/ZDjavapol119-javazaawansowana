package com.sda.enums;

public enum Coffee {
    LATTE(10, "blonde"),
    ESPRESSO(0, "dark"),
    AMERICAO(5, "medium"),
    CAPPUCINO(7, "white");

    private int milk;
    private final String roast;

    Coffee(int milk, String roast) {
        this.milk = milk;
        this.roast = roast;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public String getRoast() {
        return roast;
    }

    public Coffee getCoffeeFromRoast(String roast) {
        for (Coffee c : Coffee.values()) {
            if (this.getRoast().equals(roast)) {
                return c;
            }
        }
        return null;
    }
}

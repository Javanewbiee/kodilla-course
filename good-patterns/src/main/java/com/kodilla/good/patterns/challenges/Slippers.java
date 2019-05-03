package com.kodilla.good.patterns.challenges;

public class Slippers implements Item {

    private String color;
    private String pattern;
    private String itemType = "Slippers";

    public Slippers(String color, String pattern) {
        this.color = color;
        this.pattern = pattern;
    }

    public String getColor() {
        return color;
    }

    public String getPattern() {
        return pattern;
    }

    public String getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return color + pattern;
    }
}

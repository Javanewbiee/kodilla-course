package com.kodilla.good.patterns.challenges;

public class Game implements Item {

    private String title;
    private String itemType = "Game";

    public Game(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return title;
    }
}

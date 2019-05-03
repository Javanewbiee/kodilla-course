package com.kodilla.good.patterns.challenges;

public class Order {

    private User user;
    private Item item;
    private String info;

    public Order(User user, Item item, String info) {
        this.user = user;
        this.item = item;
        this.info = info;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public String getInfo() {
        return info;
    }
}

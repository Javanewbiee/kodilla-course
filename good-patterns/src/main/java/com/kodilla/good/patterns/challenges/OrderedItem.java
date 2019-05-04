package com.kodilla.good.patterns.challenges;

public class OrderedItem {

    private User user;
    private Item item;

    public OrderedItem(User user, Item item) {
        this.user = user;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }
}

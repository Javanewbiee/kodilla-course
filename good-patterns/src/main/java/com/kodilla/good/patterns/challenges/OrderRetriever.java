package com.kodilla.good.patterns.challenges;

public class OrderRetriever {

    public OrderedItem retrieve() {
        User user = new User("Amelia Kart","EjKej","Aek@smth.com", 123456789);
        Item item = new Game("The Witcher");

        return new OrderedItem(user, item);
    }
}

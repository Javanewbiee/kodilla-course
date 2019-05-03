package com.kodilla.good.patterns.challenges;

public class OrderRetriever {

    public Order retrieve() {
        User user = new User("Amelia Kart","EjKej","Aek@smth.com", 123456789);
        Item item = new Game("The Witcher");
        String info = "mail";

        return new Order(user, item, info);
    }
}

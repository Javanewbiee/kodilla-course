package com.kodilla.good.patterns.challenges;

public class GameDataBaseSend implements DataBaseSend{

    public void send(OrderedItem order) {
        System.out.println("Order sent to database");
    }
}

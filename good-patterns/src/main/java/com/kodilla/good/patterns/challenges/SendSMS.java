package com.kodilla.good.patterns.challenges;

public class SendSMS implements Information{

    private Order order;

    public void inform(int phoneNumber){

        Item toSend = order.getItem();
        System.out.println("Item: " + toSend + "has been ordered");
    }
}

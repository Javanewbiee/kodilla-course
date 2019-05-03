package com.kodilla.good.patterns.challenges;


public class SendMail implements Information {

    public void inform(Order order){
        order.getUser().geteMail();
        Item toSend = order.getItem();
        System.out.println("Item: " + toSend + " has been ordered");
    }
}

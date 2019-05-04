package com.kodilla.good.patterns.challenges;


public class SendMail implements Information {

    public void inform(OrderedItem orderedItem){

        String toWho = orderedItem.getUser().geteMail();
        Item toSend = orderedItem.getItem();
        System.out.println("Item: " + toSend + " has been ordered");
    }
}

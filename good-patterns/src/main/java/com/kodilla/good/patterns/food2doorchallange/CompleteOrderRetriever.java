package com.kodilla.good.patterns.food2doorchallange;

public class CompleteOrderRetriever {

    public CompleteOrder retrieve(){
        User user = new User("Mark Kart", 123456789, "mk@smth.com","Katowice, Warta 12/7");
        Order order = new Order("ExtraFoodShop", "Lion cerials", 2, "eMail");

        return new CompleteOrder(user,order);
    }
}

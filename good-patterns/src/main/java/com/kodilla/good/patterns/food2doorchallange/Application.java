package com.kodilla.good.patterns.food2doorchallange;

public class Application {

    public static void main(String[] args){

        CompleteOrderRetriever retrive = new CompleteOrderRetriever();
        CompleteOrder order = retrive.retrieve();
        ExtraFoodShopOrderProcessor process = new ExtraFoodShopOrderProcessor();
        process.process(order);
    }
}

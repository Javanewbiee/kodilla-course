package com.kodilla.good.patterns.food2doorchallange;

public class Application {

    public static void main(String[] args){

        CompleteOrderRetriever retrive = new CompleteOrderRetriever();
        CompleteOrder order = retrive.retrieve();
        Producers producers = new ExtraFoodShop();
        FoodProcessor foodProcessor = new FoodProcessor();
        foodProcessor.foodProcessor(producers, order);
    }
}

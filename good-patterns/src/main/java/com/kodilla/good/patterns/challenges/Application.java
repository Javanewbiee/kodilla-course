package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String args[]){

        OrderRetriever orderRetriever = new OrderRetriever();
        OrderedItem order = orderRetriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(new SendMail(),new GameDataBaseSend());
        productOrderService.process(order);
    }
}

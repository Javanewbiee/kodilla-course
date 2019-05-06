package com.kodilla.good.patterns.food2doorchallange;

import com.kodilla.good.patterns.food2doorchallange.NewProducer;

import java.util.HashMap;
import java.util.Map;

public class ProducersDataBase {

    private Map producersList = new HashMap();
    private NewProducer newProducer;

    NewProducer efs = new NewProducer("ExtraFoodShop", "Lion cerials", "efs.@smth.com");
    NewProducer gls = new NewProducer("GlutenFreeShop","Water", "gls@smth.com");
    NewProducer hs = new NewProducer("HealthyShop","Cabbage", "hs@.smth.com");

    public void addProducer(NewProducer newProducer){
        producersList.put(0, efs);
        producersList.put(1,gls);
        producersList.put(2,hs);
        Integer i = 2;
        producersList.put(i++,newProducer);

        System.out.println("New producer added " + producersList.entrySet());
    }
}

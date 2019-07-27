package com.kodilla.patterns3.decorator.pizza;

import java.math.BigDecimal;

public class PizzaStarter implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Pizza with tomatoe souse,cheese";
    }
}

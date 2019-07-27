package com.kodilla.patterns3.decorator.pizza.decorators;

import com.kodilla.patterns3.decorator.pizza.AbstractPizzaOrderDecorator;
import com.kodilla.patterns3.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator {

    public ExtraCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + extra cheese";
    }
}

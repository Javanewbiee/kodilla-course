package com.kodilla.patterns3.decorator.pizza.decorators;

import com.kodilla.patterns3.decorator.pizza.AbstractPizzaOrderDecorator;
import com.kodilla.patterns3.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class KebabDecorator extends AbstractPizzaOrderDecorator {

    public KebabDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + kebab";
    }
}

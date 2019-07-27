package com.kodilla.patterns3.decorator.pizza;

import com.kodilla.patterns3.decorator.pizza.decorators.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testVegeterianPizzaCost() {
        //Given
        PizzaOrder order = new PizzaStarter();
        order = new CornDecorator(order);
        order = new OliveDecorator(order);
        order = new ChampignionMushroomsDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(24),cost);
    }
    @Test
    public void testVegetarianPizzaDescription() {
        //Given
        PizzaOrder order = new PizzaStarter();
        order = new CornDecorator(order);
        order = new OliveDecorator(order);
        order = new ChampignionMushroomsDecorator(order);
        //When
        String decription = order.getDescription();
        //Then
        Assert.assertEquals("Pizza with tomatoe souse,cheese + corn + olives + champignion mushrooms",decription);
    }
    @Test
    public void testFullMeatSpecialPizzaCost() {
        //given
        PizzaOrder order = new PizzaStarter();
        order = new HamDecorator(order);
        order = new ChickenDecorator(order);
        order = new KebabDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(26),cost);
    }
    @Test
    public void testFullMeatSpecialPizzaDescription() {
        //given
        PizzaOrder order = new PizzaStarter();
        order = new HamDecorator(order);
        order = new ChickenDecorator(order);
        order = new KebabDecorator(order);
        //When
        String description = order.getDescription();
        //Then
        Assert.assertEquals("Pizza with tomatoe souse,cheese + ham + chicken + kebab",description);
    }
}

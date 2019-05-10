package com.kodilla.spring2.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(3.0,5.0);
        double result1 = calculator.div(10.0,2.0);
        double result2 = calculator.mul(5.0,5.0);
        double result3 = calculator.sub(7.0,6.0);
        //Then

        Assert.assertEquals(8.0,result,0);
        Assert.assertEquals(5.0,result1,0);
        Assert.assertEquals(25.0,result2,0);
        Assert.assertEquals(1.0,result3,0);
    }
}

package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testPizzaBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame")
                .burger(2)
                .ingredients("Onion")
                .souce("Standard")
                .ingredients("Becon")
                .ingredients("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howMany = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howMany);
    }
}

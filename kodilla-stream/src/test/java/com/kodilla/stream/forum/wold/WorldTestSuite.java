package com.kodilla.stream.forum.wold;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import com.sun.imageio.plugins.common.BogusColorSpace;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQantity(){
        //Given
        Continent europe = new Continent();
            europe.getCountries().add(new Country("Poland", new BigDecimal("38652486")));
            europe.getCountries().add(new Country("Spain", new BigDecimal("45650235")));
            europe.getCountries().add(new Country("Angland", new BigDecimal("62450687")));
            europe.getCountries().add(new Country("Netherlands", new BigDecimal("26536689")));

         Continent asia = new Continent();
            asia.getCountries().add(new Country("Japan", new BigDecimal("50623478")));
            asia.getCountries().add(new Country("China", new BigDecimal("89536645")));
            asia.getCountries().add(new Country("Korea", new BigDecimal("64532689")));

         Continent america = new Continent();
            america.getCountries().add(new Country("USA", new BigDecimal("56232369")));
            america.getCountries().add(new Country("Canada", new BigDecimal("21987654")));

         World newWorld = new World();
            newWorld.addContinent(america);
            newWorld.addContinent(asia);
            newWorld.addContinent(europe);
        //When
        BigDecimal finalWorld = newWorld.getPeaopleQuantity();
        //Then
        BigDecimal expectedPeople = new BigDecimal("456202932");
        Assert.assertEquals(expectedPeople,finalWorld);
    }
}

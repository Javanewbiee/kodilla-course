package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent>listOfContinents = new ArrayList<>();

    public final void addContinent(Continent continent){
        listOfContinents.add(continent);
    }

    public final BigDecimal getPeaopleQuantity(){
        return  listOfContinents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeaopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}

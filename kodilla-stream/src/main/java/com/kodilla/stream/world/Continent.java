package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.kodilla.stream.world.Country;

public final class Continent {

    private final List<Country>countries;

    public Continent() {
        this.countries = new ArrayList<>();
    }

    public List<Country> getCountries() {
        return countries;
    }
}


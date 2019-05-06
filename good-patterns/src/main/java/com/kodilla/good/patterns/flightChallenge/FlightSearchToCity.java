package com.kodilla.good.patterns.flightChallenge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchToCity implements FlightSearch {

    FlightList list = new FlightList();
    List<Flight> tempFlightsFrom = new ArrayList();

    public void search(String cityName){
        Collection<Flight> tempMap = list.flighMap().values();

        tempFlightsFrom = tempMap.stream()
                .filter(flight -> flight.getFlightTo() == cityName)
                .collect(Collectors.toList());

        System.out.println(tempFlightsFrom);
    }

}

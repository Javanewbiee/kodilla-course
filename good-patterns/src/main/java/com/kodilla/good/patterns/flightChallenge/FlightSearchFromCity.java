package com.kodilla.good.patterns.flightChallenge;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightSearchFromCity implements FlightSearch {

    FlightList list = new FlightList();
    List<Flight> tempFlightsFrom = new ArrayList();

    public void search(String cityName){
        Collection<Flight> tempMap = list.flighMap().values();

        tempFlightsFrom = tempMap.stream()
                .filter(flight -> flight.getFlightFrom() == cityName)
                .collect(Collectors.toList());

        System.out.println(tempFlightsFrom);
    }

}

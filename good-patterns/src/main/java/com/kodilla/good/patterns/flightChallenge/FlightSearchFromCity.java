package com.kodilla.good.patterns.flightChallenge;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightSearchFromCity implements FlightSearch {

    private String startPoint;

    public FlightSearchFromCity(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getStartPoint() {
        return startPoint;
    }
    public String getEndPoint() {
        return "";
    }
    public String getThroughPoint() {
        return "";
    }

    FlightList list = new FlightList();
    List<Flight> tempFlightsFrom = new ArrayList();

    public void search(FlightSearch flightSearch){
        Collection<Flight> tempMap = list.flighMap().values();

        tempFlightsFrom = tempMap.stream()
                .filter(flight -> flight.getFlightFrom() == flightSearch.getStartPoint())
                .collect(Collectors.toList());

        System.out.println(tempFlightsFrom);
    }

}

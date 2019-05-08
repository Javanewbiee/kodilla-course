package com.kodilla.good.patterns.flightChallenge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchToCity implements FlightSearch {

    private String endPoint;

    public FlightSearchToCity(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }
    public String getStartPoint() {
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
                .filter(flight -> flight.getFlightTo() == flightSearch.getEndPoint())
                .collect(Collectors.toList());

        System.out.println(tempFlightsFrom);
    }

}

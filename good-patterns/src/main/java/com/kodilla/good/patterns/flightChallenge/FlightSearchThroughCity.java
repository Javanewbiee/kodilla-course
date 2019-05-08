package com.kodilla.good.patterns.flightChallenge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchThroughCity implements FlightSearch {

    private String startPoint;
    private String throughPoint;
    private String endPoint;

    public FlightSearchThroughCity(String startPoint, String throughPoint, String endPoint) {
        this.startPoint = startPoint;
        this.throughPoint = throughPoint;
        this.endPoint = endPoint;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public String getThroughPoint() {
        return throughPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    FlightList list = new FlightList();
    List<Flight> tempFlightsFrom = new ArrayList();

    public void search(FlightSearch flightSearch){
        Collection<Flight> tempMap = list.flighMap().values();

        tempFlightsFrom = tempMap.stream()
                .filter(n -> n.getFlightFrom() == flightSearch.getStartPoint() || n.getFlightTo() == flightSearch.getEndPoint())
                .filter(m ->  m.getFlightTo() == flightSearch.getThroughPoint() || m.getFlightFrom() == flightSearch.getThroughPoint())
                .collect(Collectors.toList());

        System.out.println(tempFlightsFrom);
    }
}

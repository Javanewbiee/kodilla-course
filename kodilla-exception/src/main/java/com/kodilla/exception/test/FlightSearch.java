package com.kodilla.exception.test;

import com.kodilla.exception.test.Flight;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Balice", true);
        flightMap.put("Pyrzowice", true);
        flightMap.put("Heathrow", false);
        flightMap.put("JFK", false);

            if (flightMap.containsKey(flight.getArrivalAirport()) && flightMap.containsKey(flight.getDepartureAirport())) {
                for (Map.Entry<String, Boolean> entry : flightMap.entrySet()) {
                    if (flight.getArrivalAirport() == entry.getKey()) {
                        if (entry.getValue() == true) {
                            System.out.println("Flight to that airport is available");
                        } else {
                            System.out.println("Flight to that airport is NOT available");
                        }
                    }
                }

            }else{
                throw new RouteNotFoundException();
            }

        }
    }

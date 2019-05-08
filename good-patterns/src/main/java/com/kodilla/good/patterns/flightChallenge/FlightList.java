package com.kodilla.good.patterns.flightChallenge;

import java.util.HashMap;

public class FlightList {

    Flight flight1 = new Flight("Wrocław", "Warszawa");
    Flight flight2 = new Flight("Warszawa", "Gdańsk");
    Flight flight3 = new Flight("Wrocław", "Gdańsk");
    Flight flight4 = new Flight("Katowice", "Wrocław");
    Flight flight5 = new Flight("Katowice", "Warszawa");
    Flight flight6 = new Flight("Katowice", "Gdańsk");
    Flight flight7 = new Flight("Gdańsk", "Katowice");
    Flight flight8 = new Flight("Gdańsk",  "Wrocław");
    Flight flight9 = new Flight("Wrocław",  "Katowice");
    Flight flight10 = new Flight("Warszawa", "Wrocław");

    public HashMap<Integer, Flight>flighMap(){
        HashMap<Integer, Flight>mapOfFlights = new HashMap<>();
            mapOfFlights.put(1,flight1);
            mapOfFlights.put(2,flight2);
            mapOfFlights.put(3,flight3);
            mapOfFlights.put(4,flight4);
            mapOfFlights.put(5,flight5);
            mapOfFlights.put(6,flight6);
            mapOfFlights.put(7,flight7);
            mapOfFlights.put(8,flight8);
            mapOfFlights.put(9,flight9);
            mapOfFlights.put(10,flight10);

            return new HashMap<Integer, Flight>(mapOfFlights);
    }
}


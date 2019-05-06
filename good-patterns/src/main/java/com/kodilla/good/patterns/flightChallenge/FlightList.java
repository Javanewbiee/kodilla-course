package com.kodilla.good.patterns.flightChallenge;

import java.util.HashMap;

public class FlightList {

    Flight straight1 = new StraightFlight("Wrocław", "Warszawa");
    Flight straight2 = new StraightFlight("Warszawa", "Gdańsk");
    Flight straight3 = new StraightFlight("Wrocław", "Gdańsk");
    Flight straight4 = new StraightFlight("Katowice", "Wrocław");
    Flight straight5 = new StraightFlight("Katowice", "Warszawa");
    Flight through1 = new ThroughFlight("Katowice", "Wrocław", "Warszawa");
    Flight through2 = new ThroughFlight("Katowice", "Warszawa", "Gdańsk");
    Flight through3 = new ThroughFlight("Gdańsk", "Warszawa", "Wrocław");
    Flight through4 = new ThroughFlight("Wrocław", "Gdańsk", "Katowice");
    Flight through5 = new ThroughFlight("Warszawa", "Wrocław", "Gdańsk");

    public HashMap<Integer, Flight>flighMap(){
        HashMap<Integer, Flight>mapOfFlights = new HashMap<>();
            mapOfFlights.put(1,straight1);
            mapOfFlights.put(2,straight2);
            mapOfFlights.put(3,straight3);
            mapOfFlights.put(4,straight4);
            mapOfFlights.put(5,straight5);
            mapOfFlights.put(6,through1);
            mapOfFlights.put(7,through2);
            mapOfFlights.put(8,through3);
            mapOfFlights.put(9,through4);
            mapOfFlights.put(10,through5);

            return new HashMap<Integer, Flight>(mapOfFlights);
    }
}


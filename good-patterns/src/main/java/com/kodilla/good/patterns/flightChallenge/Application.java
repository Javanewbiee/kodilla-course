package com.kodilla.good.patterns.flightChallenge;

public class Application {

    public static void main(String[] args){

        FlightSearch searchFrom = new FlightSearchFromCity("Katowice");
        searchFrom.search(searchFrom);

        FlightSearch searchTo = new FlightSearchToCity("Warszawa");
        searchTo.search(searchTo);

        FlightSearch searchThrough = new FlightSearchThroughCity("Katowice","Wrocław","Gdańsk");
        searchThrough.search(searchThrough);
    }
}

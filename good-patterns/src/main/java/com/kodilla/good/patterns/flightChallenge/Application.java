package com.kodilla.good.patterns.flightChallenge;

public class Application {

    public static void main(String[] args){

        FlightSearch searchStreight = new FlightSearchFromCity();
        searchStreight.search("Katowice");

        FlightSearch searchTo = new FlightSearchToCity();
        searchTo.search("Warszawa");

        FlightSearch searchThrough = new FlightSearchThroughCity();
        searchThrough.search("Wrocław");
    }
}

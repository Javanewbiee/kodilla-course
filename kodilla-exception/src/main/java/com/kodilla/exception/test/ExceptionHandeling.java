package com.kodilla.exception.test;


public class ExceptionHandeling {

    public static void main(String args[]) {

    Flight flightOne = new Flight("JFK", "Balice");
    FlightSearch searchOne = new FlightSearch();

    try{
        searchOne.findFlight(flightOne);
    }catch(RouteNotFoundException e){

        System.out.println(e + "\nAirport is not on the list of available flightpaths");

        }
        SecondChallenge second = new SecondChallenge();

        try {
            second.probablyIWillThrowException(2.0, 1.5);
        } catch (Exception e) {
            System.out.println("Bug " + e);
        } finally {
            System.out.println("All done");
        }
    }
}

package com.kodilla.good.patterns.flightChallenge;

import java.util.HashMap;

public interface FlightSearch {

    void search(FlightSearch flightSearch);
    String getStartPoint();
    String getEndPoint();
    String getThroughPoint();
}

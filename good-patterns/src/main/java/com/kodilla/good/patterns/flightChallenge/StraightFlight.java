package com.kodilla.good.patterns.flightChallenge;

public class StraightFlight implements Flight {

    private String flightFrom;
    private String flightTo;

    public StraightFlight(String flightFrom, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public String getFlightThrough(){return "";}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StraightFlight that = (StraightFlight) o;

        if (!flightFrom.equals(that.flightFrom)) return false;
        return flightTo.equals(that.flightTo);

    }

    @Override
    public int hashCode() {
        int result = flightFrom.hashCode();
        result = 31 * result + flightTo.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return flightFrom + " -> " + flightTo;
    }
}

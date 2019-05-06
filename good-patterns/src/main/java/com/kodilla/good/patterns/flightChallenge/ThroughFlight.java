package com.kodilla.good.patterns.flightChallenge;

public class ThroughFlight implements Flight {

    private String flightFrom;
    private String flightThrough;
    private String flightTo;

    public ThroughFlight(String flightFrom, String flightThrough, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightThrough = flightThrough;
        this.flightTo = flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightThrough() {
        return flightThrough;
    }

    public String getFlightTo() {
        return flightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThroughFlight that = (ThroughFlight) o;

        if (!flightFrom.equals(that.flightFrom)) return false;
        if (!flightThrough.equals(that.flightThrough)) return false;
        return flightTo.equals(that.flightTo);

    }

    @Override
    public int hashCode() {
        int result = flightFrom.hashCode();
        result = 31 * result + flightThrough.hashCode();
        result = 31 * result + flightTo.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return flightFrom + " -> " + flightThrough + " -> "+ flightTo;
    }
}

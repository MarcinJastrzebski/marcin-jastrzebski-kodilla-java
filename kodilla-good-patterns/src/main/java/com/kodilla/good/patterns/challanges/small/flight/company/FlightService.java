package com.kodilla.good.patterns.challanges.small.flight.company;

import java.util.List;

public interface FlightService {
    List<Flight> findFlightFrom(String origin);

    List<Flight> findFlightTo(String destination);

    List<Flight> findFlight(String origin, String destination);

    List<Flight> findFlight(String origin, String through, String destination);
}
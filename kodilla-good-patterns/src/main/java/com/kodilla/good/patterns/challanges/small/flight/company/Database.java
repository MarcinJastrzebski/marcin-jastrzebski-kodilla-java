package com.kodilla.good.patterns.challanges.small.flight.company;

import java.util.List;

public interface Database {
    void addFlightToDatabase(Flight flight);

    void removeFlightFromDatabase(Flight flight);

    List<Flight> getFlightList();
}
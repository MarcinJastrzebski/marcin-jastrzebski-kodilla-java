package com.kodilla.good.patterns.challanges.small.flight.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleFlightService implements FlightService {
    private Database database;

    public SimpleFlightService(Database database) {
        this.database = database;
    }

    @Override
    public List<Flight> findFlightFrom(String origin) {
        return database.getFlightList().stream().filter(f -> origin.equals(f.getOrigin())).collect(Collectors.toList());
    }

    @Override
    public List<Flight> findFlightTo(String destination) {
        return database.getFlightList().stream().filter(f -> destination.equals(f.getDestination())).collect(Collectors.toList());
    }

    @Override
    public List<Flight> findFlight(String origin, String destination) {
        return database.getFlightList().stream().filter(f -> origin.equals(f.getOrigin()) && destination.equals(f.getDestination())).collect(Collectors.toList());
    }

    @Override
    public List<Flight> findFlight(String origin, String through, String destination) {
        List<Flight> result = database.getFlightList().stream().filter(f -> origin.equals(f.getOrigin()) && through.equals(f.getDestination())).collect(Collectors.toList());
        result.addAll(database.getFlightList().stream().filter(f -> through.equals(f.getOrigin()) && destination.equals(f.getDestination())).collect(Collectors.toList()));
        return result;
    }
}
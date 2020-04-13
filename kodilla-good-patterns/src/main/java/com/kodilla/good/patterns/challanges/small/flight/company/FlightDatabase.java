package com.kodilla.good.patterns.challanges.small.flight.company;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase implements Database {
    private List<Flight> flightDatabase;

    public FlightDatabase() {
        flightDatabase = new ArrayList<>();
        flightDatabase.add(new SimpleFlight("Warszawa", "Berlin"));
        flightDatabase.add(new SimpleFlight("Gdańsk", "Wrocław"));
        flightDatabase.add(new SimpleFlight("Gdańsk", "Kraków"));
        flightDatabase.add(new SimpleFlight("Kraków", "Wrocław"));
        flightDatabase.add(new SimpleFlight("Gdańsk", "Warszawa"));
        flightDatabase.add(new SimpleFlight("Warszawa", "Wrocław"));
    }

    @Override
    public void addFlightToDatabase(Flight flight) {
        flightDatabase.add(flight);
    }

    @Override
    public void removeFlightFromDatabase(Flight flight) {
        flightDatabase.remove(flight);
    }

    @Override
    public List<Flight> getFlightList() {
        return flightDatabase;
    }
}
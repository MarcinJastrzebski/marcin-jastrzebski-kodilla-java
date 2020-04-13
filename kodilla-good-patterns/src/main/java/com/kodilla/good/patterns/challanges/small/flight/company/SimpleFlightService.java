package com.kodilla.good.patterns.challanges.small.flight.company;

import java.util.ArrayList;
import java.util.List;

public class SimpleFlightService implements FlightService {
    private Database database;

    public SimpleFlightService(Database database) {
        this.database = database;
    }

    @Override
    public List<Flight> findFlightFrom(String origin) {
        List<Flight> result = new ArrayList<>();
        for (int i = 0; i < database.getFlightList().size(); i++) {
            //System.out.println("PETLA i = " + i + database.getFlightList().get(i));
            if (origin.equals(database.getFlightList().get(i).getOrigin())) {
                //System.out.println("Origin : " + origin);
                result.add(database.getFlightList().get(i));
            }
        }
        return result;
    }

    @Override
    public List<Flight> findFlightTo(String destination) {
        List<Flight> result = new ArrayList<>();
        for (int i = 0; i < database.getFlightList().size(); i++) {
            //System.out.println("PETLA i = " + i + database.getFlightList().get(i));
            if (destination.equals(database.getFlightList().get(i).getDestination())) {
                //System.out.println("Origin : " + destination);
                result.add(database.getFlightList().get(i));
            }
        }
        return result;
    }

    @Override
    public List<Flight> findFlight(String origin, String destination) {
        List<Flight> result = new ArrayList<>();
        for (int i = 0; i < database.getFlightList().size(); i++) {
            //System.out.println("PETLA i = " + i + database.getFlightList().get(i));
            if (destination.equals(database.getFlightList().get(i).getDestination()) && origin.equals(database.getFlightList().get(i).getOrigin())) {
                //System.out.println("Origin : " + destination);
                result.add(database.getFlightList().get(i));
            }
        }
        return result;
    }

    @Override
    public List<Flight> findFlight(String origin, String through, String destination) {
        List<Flight> result = findFlight(origin, through);
        result.addAll(findFlight(through, destination));
        return result;
    }
}
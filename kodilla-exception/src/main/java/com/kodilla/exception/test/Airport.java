package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Airport {
    private Map<String, Boolean> availableAirports;

    public Airport() {
        this.availableAirports = new HashMap<>();
        availableAirports.put("Monachium", true);
        availableAirports.put("Warsaw", true);
    }

    public void setAvailableAirports(Map<String, Boolean> map) {
        this.availableAirports.clear();
        this.availableAirports.putAll(map);
    }

    public Map<String, Boolean> getAvailableAirports() {
        return availableAirports;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> map = getAvailableAirports();
        Boolean departureAirport = null;
        Boolean arrivalAirport = null;
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (entry.getKey() == flight.getDepartureAirport()) {
                departureAirport = entry.getValue();

            }
            if (entry.getKey() == flight.getArrivalAirport()) {
                arrivalAirport = entry.getValue();
            }
        }
        if (departureAirport == null || arrivalAirport == null) {
            throw new RouteNotFoundException();
        }
        if (departureAirport == true && arrivalAirport == true) {
            System.out.println("There is a flight!");
        } else {
            System.out.println("There is not a flight!");
        }

    }
}

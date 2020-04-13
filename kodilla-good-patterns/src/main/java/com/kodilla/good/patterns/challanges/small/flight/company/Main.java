package com.kodilla.good.patterns.challanges.small.flight.company;

public class Main {
    public static void main(String[] args) {
        Database flightDatabase = new FlightDatabase();
        FlightService flightService = new SimpleFlightService(flightDatabase);
        Flight lodzPiotrkow = new SimpleFlight("Lodz", "Piotrkow");


        System.out.println(flightService.findFlightFrom("Warszawa"));
        System.out.println(flightService.findFlightTo("Wrocław"));
        System.out.println(flightService.findFlight("Warszawa", "Wrocław"));
        System.out.println(flightService.findFlight("Gdańsk", "Kraków", "Wrocław"));
        System.out.println(flightService.findFlight("Lodz", "Piotrkow"));
        flightDatabase.addFlightToDatabase(lodzPiotrkow);

        System.out.println(flightService.findFlight("Lodz", "Piotrkow"));

        flightService.findFlight("Warszawa", "Wrocław");
        flightDatabase.removeFlightFromDatabase(lodzPiotrkow);
        System.out.println(flightService.findFlight("Lodz", "Piotrkow"));

    }
}

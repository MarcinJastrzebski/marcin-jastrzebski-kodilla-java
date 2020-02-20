package com.kodilla.exception.test;

public class ThrowsMainTask {
    public static void main(String[] args) {
        Airport airport = new Airport();

        try {
            airport.findFlight(new Flight("Warsaw", "Monachium"));
        } catch (RouteNotFoundException e) {
            System.out.println("You are searching for a wrong airport. Check your searching");
        }

    }
}

package com.kodilla.good.patterns.challanges.small.flight.company;

import java.time.LocalDateTime;

public class SimpleFlight implements Flight {
    private String origin;
    private String destination;
    private LocalDateTime dateTime;

    public SimpleFlight(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public String getOrigin() {
        return origin;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + origin + '\'' +
                ", to='" + destination + '\'' +
                '}';
    }
}

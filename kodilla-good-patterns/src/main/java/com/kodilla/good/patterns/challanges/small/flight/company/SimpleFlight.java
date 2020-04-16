package com.kodilla.good.patterns.challanges.small.flight.company;

import java.time.LocalDateTime;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleFlight that = (SimpleFlight) o;
        return origin.equals(that.origin) &&
                destination.equals(that.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin, destination);
    }
}

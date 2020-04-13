package com.kodilla.good.patterns.challanges.small.flight.company;

import java.time.LocalDateTime;

public interface Flight {
    String getOrigin();

    String getDestination();

    LocalDateTime getDateTime();
}
package com.kodilla.good.patterns.challanges.ProductOrderService;

import java.time.LocalDateTime;

public class AllegroOrderService implements OrderService {

    @Override
    public boolean order(User user, LocalDateTime dateTime, Product product, int quantity, Stock stock) {
        return true;
    }
}

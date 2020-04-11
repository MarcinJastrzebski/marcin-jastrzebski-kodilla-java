package com.kodilla.good.patterns.challanges.ProductOrderService;

import java.time.LocalDateTime;

public class AllegroOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, LocalDateTime date, Product product) {
        return false;
    }
}

package com.kodilla.good.patterns.challanges.ProductOrderService;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, LocalDateTime dateTime, Product product, int quantity, StockService stockService);
}

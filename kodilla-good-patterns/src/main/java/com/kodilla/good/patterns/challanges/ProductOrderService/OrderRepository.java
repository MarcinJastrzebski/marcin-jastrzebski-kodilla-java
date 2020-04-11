package com.kodilla.good.patterns.challanges.ProductOrderService;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(final User user, final LocalDateTime date, final Product product);
}

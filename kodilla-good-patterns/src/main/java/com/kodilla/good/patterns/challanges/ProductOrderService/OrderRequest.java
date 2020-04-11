package com.kodilla.good.patterns.challanges.ProductOrderService;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime date;
    private Product product;

    public OrderRequest(final User user, final LocalDateTime date, final Product product) {
        this.user = user;
        this.date = date;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Product getProduct() {
        return product;
    }
}

package com.kodilla.good.patterns.challanges.food2door;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime date;
    private Product product;
    private Integer quantity;

    public OrderRequest(final User user, final LocalDateTime date, final Product product, final Integer quantity) {
        this.user = user;
        this.date = date;
        this.product = product;
        this.quantity = quantity;
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

    public Integer getQuantity() {
        return quantity;
    }
}
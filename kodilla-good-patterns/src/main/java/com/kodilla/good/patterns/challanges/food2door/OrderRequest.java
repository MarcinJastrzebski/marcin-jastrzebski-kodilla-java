package com.kodilla.good.patterns.challanges.food2door;

import java.time.LocalDateTime;

public class OrderRequest {
    private Supplier supplier;
    private LocalDateTime date;
    private Product product;
    private Integer quantity;

    public OrderRequest(final Supplier supplier, final LocalDateTime date, final Product product, final Integer quantity) {
        this.supplier = supplier;
        this.date = date;
        this.product = product;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
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

    @Override
    public String toString() {
        return "OrderRequest{" +
                "supplier=" + supplier +
                ", date=" + date +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
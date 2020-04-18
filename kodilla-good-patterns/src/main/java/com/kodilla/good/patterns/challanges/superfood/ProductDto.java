package com.kodilla.good.patterns.challanges.superfood;

import java.math.BigDecimal;

public class ProductDto {
    private String name;
    private BigDecimal price;
    private Supplier supplier;

    public ProductDto(String name, BigDecimal price, Supplier supplier) {
        this.name = name;
        this.price = price;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

}

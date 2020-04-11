package com.kodilla.good.patterns.challanges.ProductOrderService;

public class AuctionProduct implements Product {
    private String name;
    private String Id;

    public AuctionProduct(final String name, final String id) {
        this.name = name;
        Id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return Id;
    }
}

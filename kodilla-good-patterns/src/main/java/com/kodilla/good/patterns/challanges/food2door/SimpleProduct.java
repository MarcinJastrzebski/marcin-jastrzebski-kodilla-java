package com.kodilla.good.patterns.challanges.food2door;


public class SimpleProduct implements Product {
    private String name;
    private String Id;

    public SimpleProduct(final String name, final String id) {
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

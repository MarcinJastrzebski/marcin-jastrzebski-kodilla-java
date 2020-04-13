package com.kodilla.good.patterns.challanges.food2doorbad;

public class SimpleProduct implements Product {
    private String name;
    private String id;

    public SimpleProduct(final String name, final String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SimpleProduct{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

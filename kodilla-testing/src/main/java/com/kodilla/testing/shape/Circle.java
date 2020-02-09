package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private Double field;

    public Circle(double radius) {
        this.name = "Circle";
        this.field = 2 * Math.PI * radius;
    }

    public Circle() {
        this.name = "Circle";
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return field;
    }
}

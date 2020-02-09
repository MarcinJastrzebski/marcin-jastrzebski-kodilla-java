package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private Double field;

    public Triangle(double side) {
        this.name = "Triangle";
        this.field = (side * side * Math.sqrt(3.0)) / 4;
    }

    public Triangle() {
        this.name = "Triangle";
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

package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String name;
    Double field;

    public Triangle(double side) {
        this.name = "Triangle";
        this.field = (side * side * Math.sqrt(3.0)) / 4;
    }

    public Triangle() {
        this.name = "Triangle";
    }

    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public double getField() {
        return 0;
    }
}

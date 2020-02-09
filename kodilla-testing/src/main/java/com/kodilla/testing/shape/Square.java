package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    private Double field;

    public Square(double side) {
        this.name = "Square";
        this.field = side * side;
    }

    public Square() {
        this.name = "Square";
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

package com.kodilla.testing.shape;

public class Square implements Shape {
    String name;
    Double field;

    public Square(double side) {
        this.name = "Square";
        this.field = side * side;
    }

    public Square() {
        this.name = "Square";
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

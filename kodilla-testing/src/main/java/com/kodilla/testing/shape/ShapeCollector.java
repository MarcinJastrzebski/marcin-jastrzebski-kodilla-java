package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> list = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        this.list.add(shape);
    }

    public void removeFigure(Shape shape) {
        this.list.remove(shape);
    }

    public Shape getFigure(int index) {
        return list.get(index);
    }

    public String showFigures() {
        return list.toString();
    }

    public int getSize() {
        return this.list.size();
    }

}

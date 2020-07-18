package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Mushrooms implements Ingredient{
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(2.00);
    }

    @Override
    public String getDescription() {
        return "Mushrooms";
    }
}

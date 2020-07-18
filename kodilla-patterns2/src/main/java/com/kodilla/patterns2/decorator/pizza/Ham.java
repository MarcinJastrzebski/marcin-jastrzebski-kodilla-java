package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Ham implements Ingredient{
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(3.00);
    }

    @Override
    public String getDescription() {
        return "Ham";
    }
}

package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public interface Ingredient {
    BigDecimal getCost();
    String getDescription();
}

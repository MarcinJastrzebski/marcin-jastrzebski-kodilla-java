package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FastOrder extends AbstractPizzaOrderDecorator{
    protected FastOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" + Fast Delivery";
    }
}

package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class IngredientDecorator extends AbstractPizzaOrderDecorator{
    private Ingredient ingredient;

    public IngredientDecorator(PizzaOrder pizzaOrder, Ingredient ingredient){
        super(pizzaOrder);
        this.ingredient = ingredient;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(ingredient.getCost());
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" + "+ ingredient.getDescription();
    }
}

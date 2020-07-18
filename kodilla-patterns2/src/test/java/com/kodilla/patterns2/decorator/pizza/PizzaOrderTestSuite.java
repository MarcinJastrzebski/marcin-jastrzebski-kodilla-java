package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza (dough + cheese)", description);
    }

    @Test
    public void testBasicPizzaOrderWithSomeIngredientsGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new IngredientDecorator(theOrder, new Ham());
        theOrder = new IngredientDecorator(theOrder, new Mushrooms());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderWithSomeIngredientsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new IngredientDecorator(theOrder, new Ham());
        theOrder = new IngredientDecorator(theOrder, new Mushrooms());

        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza (dough + cheese) + Ham + Mushrooms", description);
    }

    @Test
    public void testBasicPizzaOrderWithSomeIngredientsGetCostAndFastDelivery(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new IngredientDecorator(theOrder, new Ham());
        theOrder = new IngredientDecorator(theOrder, new Mushrooms());
        theOrder = new FastOrder(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderWithSomeIngredientsGetDescriptionAndFastDelivery() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new IngredientDecorator(theOrder, new Ham());
        theOrder = new IngredientDecorator(theOrder, new Mushrooms());
        theOrder = new FastOrder(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza (dough + cheese) + Ham + Mushrooms + Fast Delivery", description);
    }
}

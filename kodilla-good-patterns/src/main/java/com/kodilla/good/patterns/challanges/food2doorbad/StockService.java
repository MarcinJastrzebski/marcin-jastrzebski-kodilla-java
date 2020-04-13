package com.kodilla.good.patterns.challanges.food2doorbad;

import java.util.Map;

public interface StockService {
    boolean checkAvailability(Product product, Integer value);
    void addItemsToStock(Product product, Integer value);
    void removeItemsFromStock(Product product, Integer value);
    Map<Product, Integer> getMapOfStock();
    int checkQuantityOfItemsInStock(Product product);
}

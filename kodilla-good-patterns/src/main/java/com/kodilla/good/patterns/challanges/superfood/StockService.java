package com.kodilla.good.patterns.challanges.superfood;

public interface StockService {
    boolean checkAvailability(String product, Integer value);

    void addItemsToStock(String product, Integer value);

    void removeItemsFromStock(String product, Integer value);

    int checkItemsInStock(String product);
}

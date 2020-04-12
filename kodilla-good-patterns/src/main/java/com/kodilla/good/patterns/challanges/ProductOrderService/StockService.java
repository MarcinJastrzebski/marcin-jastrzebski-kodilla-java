package com.kodilla.good.patterns.challanges.ProductOrderService;

public interface StockService {
    boolean checkAvailability(Product product, Integer value);
    void addItemsToStock(Product product, Integer value);
    void removeItemsFromStock(Product product, Integer value);
    int checkItemsInStock(Product product);
}

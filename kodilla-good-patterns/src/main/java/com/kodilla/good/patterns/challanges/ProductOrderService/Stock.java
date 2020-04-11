package com.kodilla.good.patterns.challanges.ProductOrderService;

public interface Stock {
    boolean checkAvailability(Product product, Integer value);
    void addItemsToStock(Product product, Integer value);
    void removeItemsfromStock(Product product, Integer value);
}

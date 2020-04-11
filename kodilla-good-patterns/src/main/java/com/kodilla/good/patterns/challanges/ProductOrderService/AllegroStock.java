package com.kodilla.good.patterns.challanges.ProductOrderService;

import java.util.HashMap;
import java.util.Map;

public class AllegroStock implements Stock {
    private Map<Product, Integer> mapOfProducts;

    public AllegroStock() {
        this.mapOfProducts = new HashMap<>();
    }
    @Override
    public void addItemsToStock(Product product, Integer value) {
        mapOfProducts.put(product, value);
    }
    @Override
    public void removeItemsfromStock(Product product, Integer value) {
        for (Map.Entry<Product, Integer> set : mapOfProducts.entrySet()) {
            if (set.getKey().equals(product) && set.getValue() - value > 0) {
                mapOfProducts.replace(product, set.getValue() - value);
            }
        }
    }

    @Override
    public boolean checkAvailability(Product product, Integer value) {
        boolean result = false;
        for (Map.Entry<Product, Integer> set : mapOfProducts.entrySet()) {

            if (set.getKey().equals(product) && set.getValue() - value > 0) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}

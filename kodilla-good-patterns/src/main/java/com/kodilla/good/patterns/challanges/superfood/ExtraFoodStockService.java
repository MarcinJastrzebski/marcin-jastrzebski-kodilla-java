package com.kodilla.good.patterns.challanges.superfood;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodStockService implements StockService {
    private Map<String, Integer> mapOfProducts;

    public ExtraFoodStockService() {
        this.mapOfProducts = new HashMap<>();
    }

    @Override
    public void addItemsToStock(String product, Integer value) {
        mapOfProducts.put(product, value);
    }

    @Override
    public void removeItemsFromStock(String product, Integer value) {
        int temporary = 0;
        for (Map.Entry<String, Integer> set : mapOfProducts.entrySet()) {
            if (set.getKey().equals(product)) {
                temporary = set.getValue();
                mapOfProducts.remove(product);
                mapOfProducts.put(product, temporary - value);
            }
        }
    }

    public int checkItemsInStock(String product) {
        int result = 0;
        for (Map.Entry<String, Integer> set : mapOfProducts.entrySet()) {
            if (set.getKey().equals(product)) {
                result = set.getValue();
            } else {
                result = 0;
            }
        }
        return result;
    }

    @Override
    public boolean checkAvailability(String product, Integer value) {
        boolean result = false;
        for (Map.Entry<String, Integer> set : mapOfProducts.entrySet()) {
            if (set.getKey().equals(product) && set.getValue() - value >= 0) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
package com.kodilla.good.patterns.challanges.food2door;

import java.util.HashMap;
import java.util.Map;

public class SimpleStockService implements StockService {
    private Map<Product, Integer> mapOfProducts;

    public SimpleStockService() {
        this.mapOfProducts = new HashMap<>();
    }


    @Override
    public void addItemsToStock(Product product, Integer value) {
        if (mapOfProducts.containsKey(product)) {
            int temporary = 0;
            for (Map.Entry<Product, Integer> set : mapOfProducts.entrySet()) {
                if (set.getKey().equals(product)) {
                    temporary = set.getValue();
                    mapOfProducts.remove(product);
                    mapOfProducts.put(product, temporary + value);
                }
            }
        } else {
            mapOfProducts.put(product, value);
        }
    }


    @Override
    public void removeItemsFromStock(Product product, Integer value) {
        int temporary = 0;
        for (Map.Entry<Product, Integer> set : mapOfProducts.entrySet()) {

            if (set.getKey().equals(product)) {
                temporary = set.getValue();
                mapOfProducts.remove(product);
                mapOfProducts.put(product, temporary - value);

            }
        }
    }

    @Override
    public Map<Product, Integer> getMapOfStock() {
        return mapOfProducts;
    }

    public int checkQuantityOfItemsInStock(Product product) {
        int result = 0;
        for (Map.Entry<Product, Integer> set : mapOfProducts.entrySet()) {

            if (set.getKey().equals(product)) {
                result = set.getValue();
            } else {
                result = 0;
            }
        }
        return result;
    }


    @Override
    public boolean checkAvailability(Product product, Integer value) {
        boolean result = false;
        for (Map.Entry<Product, Integer> set : mapOfProducts.entrySet()) {

            if (set.getKey().equals(product) && set.getValue() - value >= 0) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}

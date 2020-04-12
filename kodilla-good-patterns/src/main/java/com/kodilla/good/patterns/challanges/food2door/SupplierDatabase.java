package com.kodilla.good.patterns.challanges.food2door;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SupplierDatabase implements Database {
    private Map<Supplier, StockService> mapOfSuppliers;
    private List<Supplier> listOfSuppliers;
    private List<Product> listOfProducts;

    public SupplierDatabase() {
        mapOfSuppliers = new HashMap<>();
        listOfSuppliers = new LinkedList<>();
        listOfProducts = new LinkedList<>();
    }

    @Override
    public List<Supplier> getListOfSuppliers() {
        return listOfSuppliers;
    }

    @Override
    public List<Supplier> getListOfSuppliers(Product product) {
        return null;
    }

    @Override
    public List<Supplier> getListOfSuppliers(Product product, int quantity) {
        return null;
    }

    @Override
    public Map<Supplier, StockService> getDatabase() {
        return mapOfSuppliers;
    }

    @Override
    public boolean checkAvailabilityOfProduct(Product product) {
        return listOfProducts.contains(product);
    }

    @Override
    public void addANewSupplier(Supplier supplier, StockService stockService) {
        if (!mapOfSuppliers.containsKey(supplier)) {
            mapOfSuppliers.put(supplier, stockService);
        }
        if (!listOfSuppliers.contains(supplier)) {
            listOfSuppliers.add(supplier);
        }

        for (Map.Entry<Product, Integer> entry : stockService.getMapOfStock().entrySet()) {
            if (!listOfProducts.contains(entry.getKey())) {
                listOfProducts.add(entry.getKey());
            }
        }

    }

    @Override
    public void updateStockOfSupplier(Supplier supplier, StockService stockService) {
        addANewSupplier(supplier,stockService);
    }

    @Override
    public void actualizeStocks(Supplier supplier, StockService stockService) {

    }

    @Override
    public int checkQuantityOfItemsInStock(Product product) {
        int counter = 0;
        for (Map.Entry<Supplier, StockService> entry : mapOfSuppliers.entrySet()) {

            for (Map.Entry<Product, Integer> insideEntry : entry.getValue().getMapOfStock().entrySet()) {

                if (insideEntry.getKey().equals(product)) {
                    counter += insideEntry.getValue();
                }
            }
        }
        return counter;
    }

    @Override
    public List<Product> getCurrentListOfProducts() {
        return listOfProducts;
    }
}
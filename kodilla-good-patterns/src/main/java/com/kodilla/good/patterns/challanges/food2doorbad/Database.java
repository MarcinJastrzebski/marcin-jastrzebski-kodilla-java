package com.kodilla.good.patterns.challanges.food2doorbad;

import java.util.List;
import java.util.Map;

public interface Database {
    List<Supplier> getListOfSuppliers();
    List<Supplier> getListOfSuppliers(Product product);
    List<Supplier> getListOfSuppliers(Product product, int quantity);
    Map<Supplier,StockService> getDatabase();
    boolean checkAvailabilityOfProduct(Product product);
    void addANewSupplier(Supplier supplier, StockService stockService);
    void updateStockOfSupplier(Supplier supplier, StockService stockService);
    void actualizeStocks(Supplier supplier, StockService stockService);
    int checkQuantityOfItemsInStock(Product product);
    List<Product> getCurrentListOfProducts();

}

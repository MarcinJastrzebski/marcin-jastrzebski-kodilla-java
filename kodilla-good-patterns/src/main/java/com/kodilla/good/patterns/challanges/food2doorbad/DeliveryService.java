package com.kodilla.good.patterns.challanges.food2doorbad;

import java.util.List;

public interface DeliveryService {
    List<Supplier> getListOfCurrentSuppliers(Database database);
    boolean chackAvailabilityOfTheProduct(Database database, Product product);
    int checkQuantityOfItemsInStock(Database database, Product product);
    void sendAnOrder(Supplier supplier, OrderRequest orderRequest);
    void process(Database database, Supplier supplier, OrderRequest orderRequest);
}

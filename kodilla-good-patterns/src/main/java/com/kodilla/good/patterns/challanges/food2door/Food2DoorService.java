package com.kodilla.good.patterns.challanges.food2door;

import java.util.List;
import java.util.Map;

public class Food2DoorService implements DeliveryService {

    private InformationService informationService;

    public Food2DoorService(InformationService informationService) {
        this.informationService = informationService;
    }

    public List<Supplier> getListOfCurrentSuppliers(Database database) {
        return database.getListOfSuppliers();
    }

    @Override
    public boolean chackAvailabilityOfTheProduct(Database database, Product product) {
        return database.checkAvailabilityOfProduct(product);
    }


    @Override
    public int checkQuantityOfItemsInStock(Database database, Product product) {
        return database.checkQuantityOfItemsInStock(product);
    }

    @Override
    public void sendAnOrder(Supplier supplier, OrderRequest orderRequest) {

    }

    @Override
    public void process(Database database,Supplier supplier, OrderRequest orderRequest) {
        Product orderedProduct = orderRequest.getProduct();
        Integer orderedQuantity = orderRequest.getQuantity();
        System.out.println(orderRequest.toString());
        System.out.println(database.checkQuantityOfItemsInStock(orderRequest.getProduct()));
        System.out.println(database.checkAvailabilityOfProduct(orderRequest.getProduct()));

        boolean possibleOrder = false;
        StockService stockService = new SimpleStockService();
        for(Map.Entry<Supplier,StockService> entry : database.getDatabase().entrySet()) {
            if (supplier.equals(entry.getKey())) {
                System.out.println("Possible  Supplier");
                stockService = entry.getValue();
            }
        }
        for(Map.Entry<Product,Integer> entry : stockService.getMapOfStock().entrySet()){
            if (orderedProduct.equals(entry.getKey())){
                System.out.println("Possible  Product");
                if (orderedQuantity<=entry.getValue()){
                    System.out.println("Possible  quantity");
                    possibleOrder =true;
                }
            }
        }


        System.out.println("Possible order = "+possibleOrder);
        if (possibleOrder){
            informationService.inform(orderRequest,possibleOrder);

        } else{
            informationService.inform(orderRequest, possibleOrder);
        }

    }
}

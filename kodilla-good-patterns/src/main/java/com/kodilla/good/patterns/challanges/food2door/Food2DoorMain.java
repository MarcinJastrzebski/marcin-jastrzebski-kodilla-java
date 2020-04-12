package com.kodilla.good.patterns.challanges.food2door;

import java.time.LocalDateTime;

public class Food2DoorMain {
    public static void main(String[] args) {
        Database database = new SupplierDatabase();
        Supplier extraFoodShop = new SimpleSupplier("Adam", "Kowalski", "adam.kowalski@extrafoodshop.pl","Lodz ul. Piotrkowska","ExtraFoodShop");
        Supplier healthyShop = new SimpleSupplier("Marta", "Nowak", "marta.nowak@healthyshop.pl","Kraków ul. Wawelska","HealthyShop");
        StockService stockOfExtraFoodShop = new SimpleStockService();
        StockService stockOfHealthyShop= new SimpleStockService();
        Product tomato = new SimpleProduct("Tomato","001");
        Product banana = new SimpleProduct("Banana","002");
        stockOfExtraFoodShop.addItemsToStock(banana,500);
        //stockOfExtraFoodShop.addItemsToStock(tomato,100);
        database.addANewSupplier(extraFoodShop,stockOfExtraFoodShop);
        database.addANewSupplier(healthyShop,stockOfHealthyShop);
        stockOfExtraFoodShop.addItemsToStock(tomato,100);
        stockOfHealthyShop.addItemsToStock(banana,600);
        Supplier me = new SimpleSupplier("Marcin", "Jastrzębski","jaczomb@gmail.com","Rzgowska Zgierz","Food2Door");
        database.updateStockOfSupplier(extraFoodShop,stockOfExtraFoodShop);
        database.updateStockOfSupplier(healthyShop,stockOfHealthyShop);
        DeliveryService food2DoorService = new Food2DoorService(new MailingInformationService());

        System.out.println(food2DoorService.getListOfCurrentSuppliers(database));

        System.out.println(database.checkAvailabilityOfProduct(banana));
        System.out.println(database.checkQuantityOfItemsInStock(tomato));
        System.out.println(food2DoorService.chackAvailabilityOfTheProduct(database, banana));
        System.out.println(food2DoorService.checkQuantityOfItemsInStock(database, banana));

        System.out.println(database.checkQuantityOfItemsInStock(tomato));
        System.out.println(database.getCurrentListOfProducts().toString());

        OrderRequest order = new OrderRequest(me, LocalDateTime.now(),tomato,90);


        food2DoorService.process(database, extraFoodShop, order);



    }
}

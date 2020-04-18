package com.kodilla.good.patterns.challanges.food2door;

import java.time.LocalDateTime;

public class Shop {

    public static void process(Supplier supplier, InformationService informationService, OrderRequest orderRequest) {
        informationService.inform(orderRequest, supplier.process(orderRequest));
    }

    public static void main(String[] args) {
        InformationService informationService = new MailingInformationService();
        StockService extraFoodStockService = new ExtraFoodStockService();
        Supplier extraFoodShop = new ExtraFoodShop("Extra Food Shop", "biuro@extrafoodshop.pl", "Lodź", extraFoodStockService);
        User user1 = new SimpleUser("MiLO", " Michal Lodzinski");
        User user2 = new SimpleUser("Zbych", " Zbigniew Kowalski");
        SimpleProduct bananas = new SimpleProduct("Bananas", "001");
        SimpleProduct tomatoes = new SimpleProduct("Tomatoes", "002");
        extraFoodStockService.addItemsToStock(bananas, 20);
        OrderRequest firstOrder = new OrderRequest(user1, LocalDateTime.now(), bananas, 15);
        OrderRequest secondOrder = new OrderRequest(user1, LocalDateTime.now(), tomatoes, 55);

        StockService healthyFoodStockService = new HealthyShopStockService();
        Supplier HealthySHop = new HealthyShop("Healthy Shop", " biuro@healthyshop.pl", "Warszawa", healthyFoodStockService);

        process(extraFoodShop, informationService, firstOrder);
        process(extraFoodShop, informationService, firstOrder);
        extraFoodStockService.addItemsToStock(bananas, 20);

        process(extraFoodShop, informationService, firstOrder);
        process(HealthySHop, informationService, secondOrder);

        healthyFoodStockService.addItemsToStock(tomatoes, 60);
        process(HealthySHop, informationService, secondOrder);
    }
}

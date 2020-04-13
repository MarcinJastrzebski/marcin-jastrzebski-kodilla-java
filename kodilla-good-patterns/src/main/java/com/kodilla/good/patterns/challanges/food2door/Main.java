package com.kodilla.good.patterns.challanges.food2door;


import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Supplier extraFoodShop = new ExtraFoodShop("Extra Food Shop", "biuro@extrafoodshop.pl", "Lodź");
        InformationService informationService = new MailingInformationService();
        StockService extraFoodStockService = new ExtraFoodStockService();
        ProductOrderService extraFoodOrderService = new ProductOrderService(informationService, extraFoodStockService);
        User user1 = new SimpleUser("MiLO", " Michal Lodzinski");
        User user2 = new SimpleUser("Zbych", " Zbigniew Kowalski");
        SimpleProduct bananas = new SimpleProduct("Bananas", "001");
        SimpleProduct tomatoes = new SimpleProduct("Tomatoes", "002");
        extraFoodOrderService.getStockService().addItemsToStock(bananas, 20);
        OrderRequest firstOrder = new OrderRequest(user1, LocalDateTime.now(), bananas, 15);
        OrderRequest secondOrder = new OrderRequest(user1, LocalDateTime.now(), tomatoes, 55);

        Supplier HealthySHop = new HealthyShop("Healthy Shop", " biuro@healthyshop.pl", "Warszawa");
        StockService healthyFoodStockService = new HealthyShopStockService();
        ProductOrderService healthyShopOrderService = new ProductOrderService(informationService, healthyFoodStockService);

        process(extraFoodShop, extraFoodOrderService, firstOrder);
        process(extraFoodShop, extraFoodOrderService, firstOrder);
        extraFoodOrderService.getStockService().addItemsToStock(bananas, 20);
        process(extraFoodShop, extraFoodOrderService, firstOrder);
        process(HealthySHop, healthyShopOrderService, secondOrder);
        healthyFoodStockService.addItemsToStock(tomatoes, 60);
        process(HealthySHop, healthyShopOrderService, secondOrder);

    }

    public static void process(Supplier supplier, ProductOrderService productOrderService, OrderRequest orderRequest) {
        supplier.process(productOrderService, orderRequest);
    }
}

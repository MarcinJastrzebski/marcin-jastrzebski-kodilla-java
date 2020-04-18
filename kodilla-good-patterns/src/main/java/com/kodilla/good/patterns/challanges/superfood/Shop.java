package com.kodilla.good.patterns.challanges.superfood;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Shop {

    public static void main(String[] args) {

        InformationService informationService = new MailingInformationService();
        StockService extraFoodStockService = new ExtraFoodStockService();
        Supplier extraFoodShop = new ExtraFoodShop("Extra Food Shop", "biuro@extrafoodshop.pl", "Lodź", extraFoodStockService);
        StockService healthyFoodStockService = new HealthyShopStockService();
        Supplier healthySHop = new HealthyShop("Healthy Shop", " biuro@healthyshop.pl", "Warszawa", healthyFoodStockService);


        UserDto user1 = new UserDto("Michal Lodzinski", "Piotrkow", "lodzinskim@op.pl");
        UserDto user2 = new UserDto("Zbigniew Kowalski", "Lodz","zbyszek@gmail.com");
        String bananas = "Bananas";
        String tomatoes = "Tomatoes";
        extraFoodStockService.addItemsToStock(bananas, 20);

        Map<ProductDto,Integer> order = new HashMap<>();
        order.put(new ProductDto(bananas,new BigDecimal("10.99"),extraFoodShop),10);
        order.put(new ProductDto(tomatoes,new BigDecimal("4.59"),healthySHop),5);


        OrderRequest firstOrder = new OrderRequest(user1, order);
        OrderRequest secondOrder = new OrderRequest(user2, order);



        OrderProcessor orderProcessor = new OrderProcessor(informationService);
        orderProcessor.process(firstOrder);
        orderProcessor.process(secondOrder);

        extraFoodStockService.addItemsToStock(bananas, 20);

        orderProcessor.process(firstOrder);
        orderProcessor.process(secondOrder);


        healthyFoodStockService.addItemsToStock(tomatoes, 60);
        orderProcessor.process(firstOrder);
    }
}

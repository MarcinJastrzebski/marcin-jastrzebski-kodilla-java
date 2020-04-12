package com.kodilla.good.patterns.challanges.ProductOrderService;

import java.time.LocalDateTime;

public class AllegroOrderService implements OrderService {

    @Override
    public boolean order(User user, LocalDateTime dateTime, Product product, int quantity, StockService stockService) {

        //System.out.println("Product: "+product.getName());
        //System.out.println("Stock: "+ stockService.checkItemsInStock(product));
        //System.out.println("Quantity to take: "+quantity);
        //System.out.println("Availability "+stockService.checkAvailability(product,quantity));

        return stockService.checkAvailability(product,quantity);
    }
}

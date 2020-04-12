package com.kodilla.good.patterns.challanges.ProductOrderService;

import java.time.LocalDateTime;

public class AllegroMain {
    public static void main(String[] args) {
        User user1 = new SimpleUser("MiLO", " Michal Lodzinski");
        User user2 = new SimpleUser("Zbych", " Zbigniew Kowalski");
        AuctionProduct game = new AuctionProduct("MonopolyGame", "001");
        AuctionProduct toothbrush = new AuctionProduct("Toothbrush", "002");
        AuctionProduct slippers = new AuctionProduct("Slippers", "003");
        MailingInformationService mailingInformationService = new MailingInformationService();
        AllegroOrderService allegroOrderService = new AllegroOrderService();
        AllegroOrderRepository allegroOrderRepository = new AllegroOrderRepository();
        StockService stockService = new AllegroStockService();
        stockService.addItemsToStock(game,10);

        ProductOrderService productOrderService = new ProductOrderService(mailingInformationService, allegroOrderService, allegroOrderRepository, stockService);
        productOrderService.process(new OrderRequest(user1, LocalDateTime.now(), game,8));
        productOrderService.process(new OrderRequest(user2, LocalDateTime.now(), game,2));
        productOrderService.process(new OrderRequest(user2, LocalDateTime.now(), toothbrush,11));
        stockService.addItemsToStock(toothbrush,15);
        productOrderService.process(new OrderRequest(user2, LocalDateTime.now(), toothbrush,11));
        productOrderService.process(new OrderRequest(user1, LocalDateTime.now(), slippers,12));

    }
}

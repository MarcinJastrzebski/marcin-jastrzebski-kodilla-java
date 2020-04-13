package com.kodilla.good.patterns.challanges.food2door;

public class ProductOrderService {

    private InformationService informationService;
    private StockService stockService;

    public ProductOrderService(final InformationService informationService, final StockService stockService) {
        this.informationService = informationService;
        this.stockService = stockService;
    }

    public InformationService getInformationService() {
        return informationService;
    }

    public StockService getStockService() {
        return stockService;
    }
}
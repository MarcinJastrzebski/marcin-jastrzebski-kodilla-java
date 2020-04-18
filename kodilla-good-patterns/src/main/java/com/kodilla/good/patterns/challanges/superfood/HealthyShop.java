package com.kodilla.good.patterns.challanges.superfood;

public class HealthyShop implements Supplier {
    private String brandName;
    private String email;
    private String address;
    private StockService stockService;

    public HealthyShop(final String brandName, final String email, final String address, final StockService stockService) {
        this.brandName = brandName;
        this.email = email;
        this.address = address;
        this.stockService = stockService;
    }

    @Override
    public String getBrandName() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public boolean process(String productName, int quantity){

        boolean isAvailable = stockService.checkAvailability(productName, quantity);
        if (isAvailable) {
            stockService.removeItemsFromStock(productName, quantity);
        }
        return isAvailable;
    }
}
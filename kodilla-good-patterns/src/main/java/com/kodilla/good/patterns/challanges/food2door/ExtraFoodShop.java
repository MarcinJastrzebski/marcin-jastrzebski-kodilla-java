package com.kodilla.good.patterns.challanges.food2door;

public class ExtraFoodShop implements Supplier {
    private String brandName;
    private String email;
    private String address;
    private StockService stockService;

    public ExtraFoodShop(final String brandName, final String email, final String address, final StockService stockService) {
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
    public OrderDto process(final OrderRequest orderRequest) {
        boolean isAvailable = stockService.checkAvailability(orderRequest.getProduct(), orderRequest.getQuantity());
        if (isAvailable) {
            stockService.removeItemsFromStock(orderRequest.getProduct(), orderRequest.getQuantity());
            System.out.println("Extra Food Shop część zysku z tego zakupu przeznaczymy na walkę z wiatrakami");
        }
        return new OrderDto(orderRequest.getUser(), isAvailable);
    }

}

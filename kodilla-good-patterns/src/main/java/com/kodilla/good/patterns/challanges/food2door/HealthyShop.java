package com.kodilla.good.patterns.challanges.food2door;

public class HealthyShop implements Supplier {
    private String brandName;
    private String email;
    private String address;

    public HealthyShop(final String brandName, final String email, String address) {
        this.brandName = brandName;
        this.email = email;
        this.address = address;
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
    public void process(final ProductOrderService productOrderService, final OrderRequest orderRequest) {

        boolean isAvailable = productOrderService.getStockService().checkAvailability(orderRequest.getProduct(), orderRequest.getQuantity());

        if (isAvailable) {
            productOrderService.getInformationService().inform(orderRequest, true);
            productOrderService.getStockService().removeItemsFromStock(orderRequest.getProduct(), orderRequest.getQuantity());
        } else {
            productOrderService.getInformationService().inform(orderRequest, isAvailable);

        }
    }
}

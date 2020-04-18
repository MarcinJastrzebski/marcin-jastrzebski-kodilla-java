package com.kodilla.good.patterns.challanges.superfood;

import java.util.concurrent.atomic.AtomicBoolean;

public class OrderProcessor {
    private InformationService informationService;

    public OrderProcessor(InformationService informationService) {
        this.informationService = informationService;
    }

    public InformationService getInformationService() {
        return informationService;
    }

    public void process(OrderRequest orderRequest) {
        AtomicBoolean isSucces = new AtomicBoolean(false);

        orderRequest.getProducts().entrySet().forEach(productDtoIntegerEntry -> {
            System.out.println("Zamówienie produktu: " + productDtoIntegerEntry.getKey().getName() + " w ilości: " + productDtoIntegerEntry.getValue());
            isSucces.set(productDtoIntegerEntry.getKey().getSupplier().process(productDtoIntegerEntry.getKey().getName(), productDtoIntegerEntry.getValue()));
            if (!isSucces.get()) {
                return;
            }

        });

        informationService.inform(orderRequest, isSucces.get());
        System.out.println("\n");
    }
}

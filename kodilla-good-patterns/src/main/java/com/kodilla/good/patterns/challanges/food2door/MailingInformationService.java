package com.kodilla.good.patterns.challanges.food2door;


public class MailingInformationService implements InformationService {
    @Override
    public void inform(OrderRequest orderRequest, OrderDto orderDto) {
        if (orderDto.isSuccesfullyOrdered()) {
            System.out.println("Hello " + orderRequest.getUser().getRealName() + ". You have just ordered " + orderRequest.getQuantity()
                    + " pcs of " + orderRequest.getProduct().getName() + " in our firm. Your order will come to you soon.");
        } else {
            System.out.println("Hello " + orderRequest.getUser().getRealName() + ". You have just tried to order " + orderRequest.getQuantity()
                    + " pcs of " + orderRequest.getProduct().getName() + " in our firm. Unfortunatelly we don't have enough pcs. You have to wait or order less.");
        }
    }
}

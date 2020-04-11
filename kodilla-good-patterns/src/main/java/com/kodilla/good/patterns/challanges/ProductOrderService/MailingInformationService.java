package com.kodilla.good.patterns.challanges.ProductOrderService;

public class MailingInformationService implements InformationService {
    @Override
    public void inform(OrderRequest orderRequest) {
        System.out.println("Hello "+orderRequest.getUser().getRealName()+". You have just ordered "+orderRequest.getQuantity()+" pcs of " + orderRequest.getProduct().getName()+" in our auction");
    }
}

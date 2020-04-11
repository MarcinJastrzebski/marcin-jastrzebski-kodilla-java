package com.kodilla.good.patterns.challanges.ProductOrderService;

public class MailingInformationService implements InformationService {
    @Override
    public void inform(User user, Product product) {
        System.out.println("Hello "+user.getRealName()+". You have just ordered "+ product.getName()+" in our auction");
    }
}

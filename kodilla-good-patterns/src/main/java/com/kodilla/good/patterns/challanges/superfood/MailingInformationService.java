package com.kodilla.good.patterns.challanges.superfood;


public class MailingInformationService implements InformationService {
    @Override
    public void inform(OrderRequest orderRequest, boolean succes) {
        if (succes) {
            System.out.println("Hello " + orderRequest.getUserDto().getFullName() + " mamy Twoje zamówienie" );
        } else {
            System.out.println("Hello " + orderRequest.getUserDto().getFullName() + " prawdopodobnie brakuje nam jakiegoś produktu z Twojej listy");
        }
    }
}

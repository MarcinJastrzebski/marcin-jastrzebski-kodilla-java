package com.kodilla.good.patterns.challanges.food2door;

public class OrderDto {

    private User user;
    private boolean succesfullyOrdered;

    public OrderDto(final User user, final boolean succesfullyOrdered){
        this.user=user;
        this.succesfullyOrdered=succesfullyOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isSuccesfullyOrdered() {
        return succesfullyOrdered;
    }
}

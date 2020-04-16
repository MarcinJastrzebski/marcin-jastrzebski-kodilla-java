package com.kodilla.good.patterns.challanges.food2door;

public interface Supplier {
    String getBrandName();

    String getEmail();

    String getAddress();

    OrderDto process(OrderRequest orderRequest);
}

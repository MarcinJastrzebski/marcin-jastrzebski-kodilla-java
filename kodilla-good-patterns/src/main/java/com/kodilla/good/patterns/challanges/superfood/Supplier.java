package com.kodilla.good.patterns.challanges.superfood;

import com.kodilla.good.patterns.challanges.food2door.OrderDto;
import com.kodilla.good.patterns.challanges.food2door.OrderRequest;

public interface Supplier {
    String getBrandName();

    String getEmail();

    String getAddress();

    boolean process(String productName, int quantity);
}

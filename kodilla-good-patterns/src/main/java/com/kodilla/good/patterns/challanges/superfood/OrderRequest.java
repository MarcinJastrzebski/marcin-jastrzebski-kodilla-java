package com.kodilla.good.patterns.challanges.superfood;

import java.util.Map;

public class OrderRequest {
    private UserDto userDto;
    private Map<ProductDto, Integer> products;

    public OrderRequest(UserDto userDto, Map<ProductDto, Integer> products) {
        this.userDto = userDto;
        this.products = products;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public Map<ProductDto, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<ProductDto, Integer> products) {
        this.products = products;
    }
}

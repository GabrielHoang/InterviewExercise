package com.exercise.dto;

import java.util.List;

public class OrderDto {

    private List<ProductDto> products;

    public OrderDto(List<ProductDto> products) {
        this.products = products;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }
}

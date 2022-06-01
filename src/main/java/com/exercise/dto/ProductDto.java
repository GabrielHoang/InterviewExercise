package com.exercise.dto;

public class ProductDto {
    private String price;
    private String name;

    public ProductDto(String price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

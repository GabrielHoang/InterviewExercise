package com.exercise.model;

public class Address {

    private String city;
    private String postalCode;
    private double regionalDiscount;

    public Address(String city, String postalCode, double regionalDiscount) {
        this.city = city;
        this.postalCode = postalCode;
        this.regionalDiscount = regionalDiscount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public double getRegionalDiscount() {
        return regionalDiscount;
    }

    public void setRegionalDiscount(double regionalDiscount) {
        this.regionalDiscount = regionalDiscount;
    }
}

package com.exercise.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {

    private Integer id;
    private String firstname;
    private String lastName;
    private Address address;
    private Sex sex;
    private String notes;
    private Date dateOfBirth;
    private Integer externalId;
    private List<Order> orders;

    public Customer(Integer id, String firstname, String lastName, Address address, Sex sex, String notes, Date dateOfBirth, Integer externalId) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.address = address;
        this.sex = sex;
        this.notes = notes;
        this.dateOfBirth = dateOfBirth;
        this.externalId = externalId;
        this.orders = new ArrayList<>();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getExternalId() {
        return externalId;
    }

    public void setExternalId(Integer externalId) {
        this.externalId = externalId;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }
}

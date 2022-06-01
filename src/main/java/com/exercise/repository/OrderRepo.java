package com.exercise.repository;

import com.exercise.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {

    private List<Order> orders;

    public OrderRepo() {
        this.orders = new ArrayList<>();
    }

    public List<Order> findAll() {
        return orders;
    }

    public Order create(Order order) {
        this.orders.add(order);
        return order;
    }
}

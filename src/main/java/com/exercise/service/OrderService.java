package com.exercise.service;

import com.exercise.exception.NotImplementedException;
import com.exercise.model.Order;
import com.exercise.repository.OrderRepo;

public class OrderService {

    private OrderRepo repo;

    public OrderService() {
        this.repo = new OrderRepo();
    }

    // fill missing method body
    public Order createOrder(Order order) {

        throw new NotImplementedException();
    }
}

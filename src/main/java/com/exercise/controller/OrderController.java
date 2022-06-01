package com.exercise.controller;

import com.exercise.dto.CustomerDto;
import com.exercise.dto.OrderDto;
import com.exercise.dto.ProductDto;
import com.exercise.exception.NotImplementedException;
import com.exercise.service.CustomerService;
import com.exercise.service.OrderService;

import java.util.List;

public class OrderController {

    private CustomerService customerService = new CustomerService();
    private OrderService orderService = new OrderService();

    // this method should firstly check if the customer already exists. If not, then create one.
    // Afterwards create new order in customer entity and add mapped products to it.
    // In the end return purchased products as orderDto.
    public OrderDto createOrder(CustomerDto customer, List<ProductDto> products) {

        throw new NotImplementedException();
    }
}

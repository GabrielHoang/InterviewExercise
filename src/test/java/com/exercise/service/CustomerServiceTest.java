package com.exercise.service;

import com.exercise.model.Customer;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    private final CustomerService customerService = new CustomerService();

    @Test
    void shouldReturnAllCustomers() {
        List<Customer> result = customerService.findAll();

        assertThat(result).hasSize(10);
    }

    // add missing tests
}
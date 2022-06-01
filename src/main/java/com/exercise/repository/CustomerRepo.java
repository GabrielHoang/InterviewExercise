package com.exercise.repository;

import com.exercise.model.Address;
import com.exercise.model.Customer;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static com.exercise.model.Sex.FEMALE;
import static com.exercise.model.Sex.MALE;

public class CustomerRepo {

    private List<Customer> customers;

    public CustomerRepo() {
        //na potrzeby ćwiczenia
        customers = new ArrayList<>();
        customers.add(new Customer(1, "John", "Doe", new Address("Toronto", "22-123", 1.0), MALE, "shoplifter", Date.from(Instant.parse("2000-01-03T01:00:00.00Z")), 9001));
        customers.add(new Customer(2, "Marie", "Tuff", new Address("New York", "11-111", 1.0), FEMALE, "", Date.from(Instant.parse("2000-01-03T01:00:00.00Z")), 9002));
        customers.add(new Customer(3, "Liz", "Washington", new Address("Chicago", "33-123", 1.0), FEMALE, "", Date.from(Instant.parse("2000-01-03T01:00:00.00Z")), 9003));
        customers.add(new Customer(4, "Ann", "Kirb", new Address("Toronto", "22-123", 1.0), MALE, "", Date.from(Instant.parse("2003-01-03T01:00:00.00Z")), 9004));
        customers.add(new Customer(5, "Mike", "Watson", new Address("Chicago", "33-123", 1.0), MALE, "", Date.from(Instant.parse("2000-01-03T01:00:00.00Z")), 9005));
        customers.add(new Customer(6, "Chris", "Ty", new Address("Toronto", "22-123", 1.0), MALE, "dead", Date.from(Instant.parse("1996-01-03T01:00:00.00Z")), 9006));
        customers.add(new Customer(7, "Camille", "Smith", new Address("Los Angeles", "44-123", 1.0), FEMALE, "ex employee", Date.from(Instant.parse("2000-01-03T01:00:00.00Z")), 9007));
        customers.add(new Customer(8, "Mary", "Rubble", new Address("Toronto", "22-123", 1.0), FEMALE, "", Date.from(Instant.parse("1993-01-03T01:00:00.00Z")), 9008));
        customers.add(new Customer(9, "Leo", "Xi", new Address("Toronto", "22-123", 1.0), MALE, "", Date.from(Instant.parse("2000-01-03T01:00:00.00Z")), 9009));
        customers.add(new Customer(10, "Fennek", "Smith", new Address("Los Angeles", "44-123", 1.0), FEMALE, "", Date.from(Instant.parse("2004-01-03T01:00:00.00Z")), 9010));
    }

    public List<Customer> findAll() {
        return customers;
    }

    public Customer create(Customer customer) {
        customers.add(customer);
        return customer;
    }

    //this method takes internal NOT external id
    public void deleteCustomerById(Integer id) {
        Optional<Customer> optionalCustomer = customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst();

        optionalCustomer.ifPresent(customer -> customers.remove(customer));
    }
}

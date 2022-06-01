package com.exercise.service;

import com.exercise.exception.NotImplementedException;
import com.exercise.model.Customer;
import com.exercise.model.Sex;
import com.exercise.repository.CustomerRepo;

import java.util.List;
import java.util.Optional;

public class CustomerService {

    private CustomerRepo repo;

    public CustomerService() {
        this.repo = new CustomerRepo();
    }

    public List<Customer> findAll() {
        return repo.findAll();
    }

    // fill method body, so it will check if there is no customer duplicate already in repository (based on first name,
    // last name, sex and date of birth). If there is duplicate throw an exception, otherwise returh newly created customer
    public Customer createCustomer(Customer customer) {

        throw new NotImplementedException();
    }

    // fill method body, so it will remove customer from repository, based on its external id
    public void removeCustomerByExternalId(Integer externalId) {

        throw new NotImplementedException();
    }

    // fill method body, so it will return all underage customers, ordered descendent by age
    public List<Customer> findAllUnderage() {

        throw new NotImplementedException();
    }

    // fill method body, so it will find customer based on provided first and last names.
    // If there is no such customer method should return empty optional.
    public Optional<Customer> findByFirstNameAndLastName(String firstName, String lastName) {

        throw new NotImplementedException();
    }

    // fill method body, so it will set notes to Customers from provided city that do not have existing notes yet
    // and return those customers
    public List<Customer> addNotes(String note, String city) {

        throw new NotImplementedException();
    }

    // fill method body, so it will set new regional discount for all Females coming from provided city to 95%.
    public void setRegionalDiscount(double regionalDiscount, String city, Sex sex) {

        throw new NotImplementedException();
    }
}

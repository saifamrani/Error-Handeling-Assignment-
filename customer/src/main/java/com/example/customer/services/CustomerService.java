package com.example.customer.services;

import com.example.customer.model.Customer;

import com.example.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveNewCustomer(Customer customer) {
        if (customer.getFirstName().equals("") || customer.getLastName().equals("")) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE
            );
        }else if (customer.getFirstName().equalsIgnoreCase("Saif")){
            throw new ResponseStatusException(
                    HttpStatus.NETWORK_AUTHENTICATION_REQUIRED
            );
        }
        return customerRepository.save(customer);

    }

    public Iterable<Customer> findAll() {
        return null;
    }
}

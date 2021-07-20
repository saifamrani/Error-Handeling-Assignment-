package com.example.customer.controller;

import com.example.customer.model.Customer;
import com.example.customer.model.WebOrder;
import com.example.customer.repository.CustomerRepository;
import com.example.customer.services.CustomerService;
import com.example.customer.services.WebOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@CrossOrigin
@RestController
@RequestMapping("/api/customer/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public Iterable<Customer> getAll() {
        return this.customerService.findAll();
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return this.customerService.saveNewCustomer(
                customer);
    }
}
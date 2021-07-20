package com.example.customer.model;

import javax.persistence.*;

@Entity
public class WebOrder {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String description;

    @ManyToOne
    private Customer customer;

    public WebOrder() {
    }

    public WebOrder(int id, String description, Customer customer) {
        this.id = id;
        this.description = description;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

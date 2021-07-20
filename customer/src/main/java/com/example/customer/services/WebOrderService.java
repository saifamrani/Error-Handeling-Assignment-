package com.example.customer.services;

import com.example.customer.model.Customer;
import com.example.customer.model.WebOrder;
import com.example.customer.repository.CustomerRepository;
import com.example.customer.repository.WebOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class WebOrderService {

    @Autowired
    private WebOrderRepository webOrderRepository;

     @Autowired
    private CustomerRepository customerRepository;

    public WebOrder saveNewOrder(WebOrder newWebOrder) {
        Customer customerOfOrder = newWebOrder.getCustomer();
        if (customerOfOrder != null) {
            if (this.customerRepository.existsById(customerOfOrder.getId())) {
                return this.webOrderRepository.save(newWebOrder);
            }

        }
        throw new ResponseStatusException(
                HttpStatus.I_AM_A_TEAPOT
        );
    }
    public Iterable <WebOrder> getAll (){
        return this.webOrderRepository.findAll();
    }


}

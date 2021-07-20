package com.example.customer.controller;

import com.example.customer.model.WebOrder;
import com.example.customer.repository.WebOrderRepository;
import com.example.customer.services.WebOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weborder/")
public class WebOrderController {
    @Autowired
    private WebOrderService webOrderService;

    @GetMapping()
    public Iterable<WebOrder>getAll(){
        return this.webOrderService.getAll();
    }

    @PostMapping()
    public WebOrder save (@RequestBody WebOrder webOrder){
        return this.webOrderService.saveNewOrder(webOrder);
    }

}

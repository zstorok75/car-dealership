package com.example.car.dealership.controller;

import com.example.car.dealership.service.CustomerService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public Void getCustomersByFilterParam(String id, String name) {
        return null;
    }
}

package com.car.dealership.backend.controller;

import com.car.dealership.backend.service.CustomerService;
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

package com.example.car.dealership.controller;

import com.example.car.dealership.service.CustomerService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController extends CustomerApi {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public <List<CustomerDto>> getCustomersByFilterParam(String id, String name) {

    }
}

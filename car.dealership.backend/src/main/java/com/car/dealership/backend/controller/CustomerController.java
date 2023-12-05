package com.car.dealership.backend.controller;

import com.car.dealership.backend.dto.CustomerDto;
import com.car.dealership.backend.entity.CustomerEntity;
import com.car.dealership.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public CustomerController() {}

    @GetMapping()
    public ResponseEntity<List<CustomerDto>> getCustomersByName(String name) {
        try {
            List<CustomerEntity> entityList = this.customerService.getCustomersByName(name);
            List<CustomerDto> dtoList = this.customerService.mappingEntityListToDtoList(entityList);

            return new ResponseEntity<>(dtoList, HttpStatus.OK);

        } catch (UnsupportedOperationException e ) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/teszt")
    public ResponseEntity<String> getTest() {
        return new ResponseEntity<>("Teszt OK", HttpStatus.OK);
    }
}

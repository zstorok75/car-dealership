package com.car.dealership.backend.service;

import com.car.dealership.backend.entity.CustomerEntity;
import com.car.dealership.backend.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerService() {}

    public void saveNewCustomer() {
        CustomerEntity entity = new CustomerEntity();
        this.customerRepository.save(entity);
    }

    public List<CustomerEntity> getCustomersByName(String name) {
        if (name != null) {
            return this.customerRepository.getCustomersByName(name);
        } else {
            return this.customerRepository.findAll();
        }
    }
}

package com.example.car.dealership.service;

import com.example.car.dealership.entity.CustomerEntity;
import com.example.car.dealership.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveNewCustomer(CustomerDto dto) {
        CustomerEntity entity = new CustomerEntity(dto);
        this.customerRepository.save(entity);
    }

    public List<CustomerEntity> getCustomersByFilterParam(filter: any) {
        if (filter.id != null) {
            List<CustomerEntity> list = new ArrayList<>();
            list.add(this.customerRepository.getById(filter.id));
            return list;
        } else if (filter.name != null) {
            return this.customerRepository.findBy()
        }
    }
}

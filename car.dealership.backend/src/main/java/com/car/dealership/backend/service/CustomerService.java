package com.car.dealership.backend.service;

import com.car.dealership.backend.dto.CustomerDto;
import com.car.dealership.backend.entity.CustomerEntity;
import com.car.dealership.backend.mapper.CustomerMapper;
import com.car.dealership.backend.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerMapper customerMapper;

    public CustomerService() {}

    public void saveNewCustomer() {
        CustomerEntity entity = new CustomerEntity();
        this.customerRepository.save(entity);
    }

    public List<CustomerEntity> getCustomersByName(String name) {
        if (name != null) {
            return this.customerRepository.getCustomersByName(name);
        } else {
            return this.getAllCustomers();
        }
    }

    public List<CustomerEntity> getAllCustomers() {
        return this.customerRepository.findAll();
    }

    public List<CustomerEntity> mappingDtoListToEntityList(List<CustomerDto> dtoList) {
        throw new NotImplementedException("Function not implemented yet");
    }

    public List<CustomerDto> mappingEntityListToDtoList(List<CustomerEntity> entityList) {
        List<CustomerDto> dtoList = new ArrayList<>();
        entityList.forEach(
                entity -> {
                    dtoList.add( this.customerMapper.entityToDto(entity) );
                }
        );

        return dtoList;
    }
}

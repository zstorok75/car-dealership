package com.car.dealership.backend.repository;

import com.car.dealership.backend.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {

    List<CustomerEntity> getCustomersByName(String name);

}

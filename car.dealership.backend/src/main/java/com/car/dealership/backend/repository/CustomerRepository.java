package com.example.car.dealership.repository;

import com.example.car.dealership.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {

    @Query(name = "SELECT c FROM Customer WHERE c.name ")
    List<CustomerEntity> getCustomersByName(String name);
}

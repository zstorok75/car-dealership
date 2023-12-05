package com.car.dealership.backend.repository;

import com.car.dealership.backend.entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, Long> {

    Optional<StaffEntity> findByContactEmail(String email);
}

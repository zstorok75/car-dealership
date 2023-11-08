package com.example.car.dealership.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity {

    @Id
    @UUID
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    public CustomerEntity() {}

    public CustomerEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public CustomerEntity(CustomerDto dto) {
        if (dto.id != null) {
            this.id = dto.id;
        }
        this.name = dto.name;
        this.email = dto.email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

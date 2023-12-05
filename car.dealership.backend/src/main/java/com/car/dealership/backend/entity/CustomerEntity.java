package com.car.dealership.backend.entity;

import com.car.dealership.backend.dto.CustomerDto;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity {

    @Id
    // @UUID
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

//    @ManyToOne
//    @JoinColumn(name = "ADDRESS_ID")
//    private AddressEntity address;

//    @OneToOne(mappedBy = "person")
//    private StaffEntity staff;

    public CustomerEntity() {}

    public CustomerEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public CustomerEntity(CustomerDto dto) {
        if (dto.getId() != null) {
            this.id = dto.getId();
        }
        this.name = dto.getName();
        this.email = dto.getEmail();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

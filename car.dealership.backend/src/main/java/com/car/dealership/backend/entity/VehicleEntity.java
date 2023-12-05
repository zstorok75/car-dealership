package com.car.dealership.backend.entity;

import com.car.dealership.backend.enums.VEHICLE_TYPE;
import com.car.dealership.backend.interfaces.ItemType;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "VEHICLE")
public class VehicleEntity {

    @Id
    // @UUID
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "TYPE")
    private VEHICLE_TYPE type;

    @Column(name = "REGO_NUMBER")
    private String registrationNumber;

    @Column(name = "BODY_NUMBER")
    private String bodyNumber;

    @Column(name = "TYPE_CODE")
    private String typeCode;

//    @Column(name = "OWNER")
//    private CustomerEntity owner;

    @Column(name = "PRODUCT_DATE")
    private LocalDateTime productDate;

//     @OneToMany(mappedBy = "vehicle")
//    private List<SubunitEntity> subunits;

    public VehicleEntity() {}

    public VehicleEntity(Long id, String brand, VEHICLE_TYPE type, String registrationNumber, String bodyNumber, String typeCode, LocalDateTime productDate) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.registrationNumber = registrationNumber;
        this.bodyNumber = bodyNumber;
        this.typeCode = typeCode;
        this.productDate = productDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public VEHICLE_TYPE getType() {
        return type;
    }

    public void setType(VEHICLE_TYPE type) {
        this.type = type;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBodyNumber() {
        return bodyNumber;
    }

    public void setBodyNumber(String bodyNumber) {
        this.bodyNumber = bodyNumber;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public LocalDateTime getProductDate() {
        return productDate;
    }

    public void setProductDate(LocalDateTime productDate) {
        this.productDate = productDate;
    }
}

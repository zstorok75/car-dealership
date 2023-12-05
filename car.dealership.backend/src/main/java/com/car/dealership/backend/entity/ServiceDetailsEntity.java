package com.car.dealership.backend.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "SERVICE_DETAILS")
public class ServiceDetailsEntity {

    @Id
    // @UUID
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRODUCT_TIME_UNIT")
    private String productTimeUnit;

    @Column(name = "TIME_UNIT_PRICE")
    private double timeUnitPrice;

    @Column(name = "VAT")
    private double vat;



    public ServiceDetailsEntity() {}

    public ServiceDetailsEntity(Long id, String name, String productTimeUnit, double timeUnitPrice, double vat) {
        this.id = id;
        this.name = name;
        this.productTimeUnit = productTimeUnit;
        this.timeUnitPrice = timeUnitPrice;
        this.vat = vat;
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

    public String getProductTimeUnit() {
        return productTimeUnit;
    }

    public void setProductTimeUnit(String productTimeUnit) {
        this.productTimeUnit = productTimeUnit;
    }

    public double getTimeUnitPrice() {
        return timeUnitPrice;
    }

    public void setTimeUnitPrice(double timeUnitPrice) {
        this.timeUnitPrice = timeUnitPrice;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }
}

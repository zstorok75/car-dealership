package com.car.dealership.backend.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ADDRESS")
public class AddressEntity {

    @Id
    //@UUID
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ZIP")
    private String zipCode;

    @Column(name = "COUNTRY")
    private String Country;

    @Column(name = "CITY")
    private String city;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "STREET_NAME")
    private String streetName;

    @Column(name = "STREET_TYPE")
    private String streetType;

    @Column(name = "STREET_NUMBER")
    private String streetNumber;

//    @OneToMany(mappedBy = "address")
//    private List<CustomerEntity> customers;

//    @OneToOne(mappedBy = "headquarter")
//    private CompanyEntity company;

//    @OneToOne(mappedBy = "address")
//    private CompanySiteEntity site;

    public AddressEntity() {}

    public AddressEntity(Long id, String zipCode, String country, String city, String district, String streetName, String streetType, String streetNumber) {
        this.id = id;
        this.zipCode = zipCode;
        Country = country;
        this.city = city;
        this.district = district;
        this.streetName = streetName;
        this.streetType = streetType;
        this.streetNumber = streetNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

}

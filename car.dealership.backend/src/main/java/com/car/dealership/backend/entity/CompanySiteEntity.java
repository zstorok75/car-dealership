package com.car.dealership.backend.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "COMPANY_SITE")
public class CompanySiteEntity {

    @Id
    // @UUID
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SITE_IDENTIFIER")
    private String siteIdentifier;

    @Column(name = "TELEPHONE")
    private String telephone;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "ADDRESS", referencedColumnName = "ID")
//    private AddressEntity address;

//    @ManyToOne
//    @JoinColumn(name = "COMPANY_ID")
//    private CompanyEntity company;



    public CompanySiteEntity() {}

    public CompanySiteEntity(Long id, String name, String siteIdentifier, String telephone) {
        this.id = id;
        this.name = name;
        this.siteIdentifier = siteIdentifier;
        this.telephone = telephone;
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

    public String getSiteIdentifier() {
        return siteIdentifier;
    }

    public void setSiteIdentifier(String siteIdentifier) {
        this.siteIdentifier = siteIdentifier;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}

package com.car.dealership.backend.entity;

import com.car.dealership.backend.enums.TYPE_OF_ORGANIZATION;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Entity
@Table(name = "COMPANY")
public class CompanyEntity {

    @Id
    //@UUID
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TELEPHONE")
    private int telephone;

    @Column(name = "EMAIL")
    private String email;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "HEADQUARTER", referencedColumnName = "ID")
//    private AddressEntity headquarter;

//    @OneToMany(mappedBy = "company")
//    private List<CompanySiteEntity> sites;

    @Column(name = "TYPE")
    private TYPE_OF_ORGANIZATION type;

    @Column(name = "TAX_FILE_NUMBER")
    private String taxFileNumber;

    public CompanyEntity() {}

    public CompanyEntity(Long id, String name, int telephone, String email, TYPE_OF_ORGANIZATION type, String taxFileNumber) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.type = type;
        this.taxFileNumber = taxFileNumber;
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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TYPE_OF_ORGANIZATION getType() {
        return type;
    }

    public void setType(TYPE_OF_ORGANIZATION type) {
        this.type = type;
    }

    public String getTaxFileNumber() {
        return taxFileNumber;
    }

    public void setTaxFileNumber(String taxFileNumber) {
        this.taxFileNumber = taxFileNumber;
    }
}

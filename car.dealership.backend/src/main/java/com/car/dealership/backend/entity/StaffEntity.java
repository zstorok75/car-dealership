package com.car.dealership.backend.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "STAFF")
public class StaffEntity implements UserDetails {

    @Id
    //@UUID
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
//    private CustomerEntity person;

//    @Column(name = "POST")
//    private PostEntity post;

//    @Column(name = "SITE")
//    private CompanySiteEntity site;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "CONTACT_NUMBER")
    private int contactNumber;

    @Column(name = "CONTACT_EMAIL")
    private String contactEmail;

    @Column(name = "PASSWORD")
    private String password;

    public StaffEntity() {}

    public StaffEntity(Long id, String department, int contactNumber, String contactEmail) {
        this.id = id;
        this.department = department;
        this.contactNumber = contactNumber;
        this.contactEmail = contactEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getUsername() {
        return contactEmail;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

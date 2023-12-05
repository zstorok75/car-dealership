package com.car.dealership.backend.entity;

import com.car.dealership.backend.enums.APPOINTMENT_TYPE;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;
import org.hibernate.validator.constraints.UniqueElements;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "APPOINTMENT")
public class AppointmentEntity {

    @Id
    //@UUID
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TYPE")
    private APPOINTMENT_TYPE type;

//    private CompanySiteEntity companySite;
//
//    private VehicleEntity vehicle;
//
//    private CustomerEntity contactPerson;

    @Column(name = "WORKSHEET_NUMBER")
    private String worksheetNumber;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

//    private StaffEntity createdBy;

    @Column(name = "DEADLINE")
    private LocalDateTime deadline;

//    private List<ItemEntity> items;

    @Column(name = "BID_COSTS")
    private Integer bidCosts;

    public AppointmentEntity() {}

    public AppointmentEntity(Long id, APPOINTMENT_TYPE type, String worksheetNumber, LocalDateTime createdAt, LocalDateTime deadline, Integer bidCosts) {
        this.id = id;
        this.type = type;
        this.worksheetNumber = worksheetNumber;
        this.createdAt = createdAt;
        this.deadline = deadline;
        this.bidCosts = bidCosts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public APPOINTMENT_TYPE getType() {
        return type;
    }

    public void setType(APPOINTMENT_TYPE type) {
        this.type = type;
    }

    public String getWorksheetNumber() {
        return worksheetNumber;
    }

    public void setWorksheetNumber(String worksheetNumber) {
        this.worksheetNumber = worksheetNumber;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public Integer getBidCosts() {
        return bidCosts;
    }

    public void setBidCosts(Integer bidCosts) {
        this.bidCosts = bidCosts;
    }
}

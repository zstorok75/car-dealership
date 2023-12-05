package com.car.dealership.backend.entity;

import com.car.dealership.backend.interfaces.ItemType;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "TASK")
public class TaskEntity {

    @Id
    // @UUID
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

//    @Column(name = "SERVICE_DETAILS")
//    private ServiceDetailsEntity serviceDetails;

    @Column(name = "SPENT_TIME")
    private double spentTime;

    public TaskEntity() {}

    public TaskEntity(Long id, String name, double spentTime) {
        this.id = id;
        this.name = name;
        this.spentTime = spentTime;
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

    public double getSpentTime() {
        return spentTime;
    }

    public void setSpentTime(double spentTime) {
        this.spentTime = spentTime;
    }
}

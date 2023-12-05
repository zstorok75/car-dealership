package com.car.dealership.backend.entity;

import com.car.dealership.backend.interfaces.ItemType;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "ITEM")
public class ItemEntity {

    @Id
    // @UUID
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "TYPE")
//    private ItemType type;

    @Column(name = "SELLING_PRICE")
    private double sellingPrice;

    @Column(name = "SELLING_QUANTITY")
    private double sellingQuantity;

    public ItemEntity() {}

    public ItemEntity(Long id, double sellingPrice, double sellingQuantity) {
        this.id = id;
        this.sellingPrice = sellingPrice;
        this.sellingQuantity = sellingQuantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getSellingQuantity() {
        return sellingQuantity;
    }

    public void setSellingQuantity(double sellingQuantity) {
        this.sellingQuantity = sellingQuantity;
    }
}

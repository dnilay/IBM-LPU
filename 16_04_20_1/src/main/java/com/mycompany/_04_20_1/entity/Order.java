package com.mycompany._04_20_1.entity;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_TABLE")
public class Order {

    @Id
    //@GeneratedValue
    @Column(name = "ORDER_ID")
    private int id;
    
    @Column(name = "SHIPPING_ADDRESS")
    private String address;
    
    //private Customer customer1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}

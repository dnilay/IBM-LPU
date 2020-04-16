package com.mycompany._04_20_1.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9118141737282490793L;

	@Id
    //@GeneratedValue
    private int id;
    
    private String name;

    // @OneToMany is default of an entity contains a collection
    // of entities. So you can comment out @OneToMany annotation below.
    // Now because we are not doing cascading, you will have 
    // to persist Order objects yourself, however.
    //@OneToMany(cascade=ALL)
    private List<Order> orders = new ArrayList<Order>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> newValue) {
        this.orders = newValue;
    }
}

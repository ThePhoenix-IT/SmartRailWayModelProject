package com.thephoenixit.smartrailwaymodel.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customer_id;

    public Customer(Long customer_id) {
        this.customer_id = customer_id;
    }
}

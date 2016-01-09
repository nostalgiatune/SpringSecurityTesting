package com.tuoppi.boot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Tuoppi
 */
@Entity
public class Product implements Serializable { 
    
    private int id;
    private String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
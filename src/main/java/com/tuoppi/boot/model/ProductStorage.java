package com.tuoppi.boot.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Tuoppi
 */
@Entity
public class ProductStorage implements Serializable {
    
    private int id;
    private Product product;
    private int amount;
    private double price;

    public ProductStorage() {
    }

    public ProductStorage(Product product, int amount, double price) {
        this.product = product;
        this.amount = amount;
        this.price = price;
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    @OneToOne (cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
    })
    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
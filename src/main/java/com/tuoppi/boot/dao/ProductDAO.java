package com.tuoppi.boot.dao;

import com.tuoppi.boot.model.Product;

/**
 *
 * @author Tuoppi
 */
public interface ProductDAO {
    
    Product getProduct(Product product);
    Product getProduct(int id);
    Product saveProduct(Product product);
    Product removeProduct(Product product);
    Product removeProduct(int id);
}
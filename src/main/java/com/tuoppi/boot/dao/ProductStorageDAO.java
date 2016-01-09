package com.tuoppi.boot.dao;

import com.tuoppi.boot.model.Product;
import com.tuoppi.boot.model.ProductStorage;

/**
 *
 * @author Tuoppi
 */
public interface ProductStorageDAO {
    
    ProductStorage getStorageInfo(Product product);
    ProductStorage getStorageInfo(int productId);
    ProductStorage getStorageInfo(ProductStorage productStorage);
    ProductStorage saveStorageInfo(ProductStorage productStorage);
}
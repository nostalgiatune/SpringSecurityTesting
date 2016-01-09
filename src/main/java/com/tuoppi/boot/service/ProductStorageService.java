package com.tuoppi.boot.service;

import com.tuoppi.boot.dao.ProductStorageDAO;
import com.tuoppi.boot.model.Product;
import com.tuoppi.boot.model.ProductStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tuoppi
 */
@Service
@Transactional
public class ProductStorageService {
    
    @Autowired
    private ProductStorageDAO dao;
    
    public ProductStorage getStorageInfo(Product product) {
        return dao.getStorageInfo(product);
    }
    
    public ProductStorage getStorageInfo(int productId) {
        return dao.getStorageInfo(productId);
    }
    
    public ProductStorage getStorageInfo(ProductStorage productStorage) {
        return dao.getStorageInfo(productStorage);
    }
    
    public ProductStorage saveStorageInfo(ProductStorage productStorage) {
        return dao.saveStorageInfo(productStorage);
    }
    
}
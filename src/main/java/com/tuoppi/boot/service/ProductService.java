package com.tuoppi.boot.service;

import com.tuoppi.boot.dao.ProductDAO;
import com.tuoppi.boot.model.Product;
import com.tuoppi.boot.model.ProductStorage;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Tuoppi
 */
@Service
@Transactional
public class ProductService {
    
    @Autowired
    private ProductDAO dao;
    
    @Autowired
    private ProductStorageService storage;
    
    public Product getProduct(Product product) {
        return dao.getProduct(product);
    }
    
    public Product getProduct(int id) {
        return dao.getProduct(id);
    }
    
    public Product saveProduct(Product product) {
        return dao.saveProduct(product);
    }
    
    public Product removeProduct(Product product) {
        return dao.removeProduct(product);
    }
    
    public Product removeProduct(int id) {
        return dao.removeProduct(id);
    }
    
    //@PostConstruct
    public void init() {
        
        Product[] products = {
            new Product("Product1"),
            new Product("Product2"),
            new Product("Product3"),
        };
        
        ProductStorage[] storageInfo = {
            new ProductStorage(products[0], 100, 999),
            new ProductStorage(products[1], 10, 12.34),
            new ProductStorage(products[2], 1, 10)
        };
        
        Arrays.stream(storageInfo).forEach(storage::saveStorageInfo);
    }
    
}
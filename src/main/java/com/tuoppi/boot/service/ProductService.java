package com.tuoppi.boot.service;

import com.tuoppi.boot.dao.ProductDAO;
import com.tuoppi.boot.model.Product;
import java.util.Arrays;
import javax.annotation.PostConstruct;
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
        Arrays.stream(products).forEach(dao::saveProduct);
    }
    
}
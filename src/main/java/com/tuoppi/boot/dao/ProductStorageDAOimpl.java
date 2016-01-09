package com.tuoppi.boot.dao;


import com.tuoppi.boot.model.Product;
import com.tuoppi.boot.model.ProductStorage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tuoppi
 */
@Repository
public class ProductStorageDAOimpl implements ProductStorageDAO {
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public ProductStorage getStorageInfo(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductStorage getStorageInfo(int productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductStorage getStorageInfo(ProductStorage productStorage) {
        return em.find(ProductStorage.class, productStorage.getId());
    }

    @Override
    public ProductStorage saveStorageInfo(ProductStorage productStorage) {
        return em.merge(productStorage);
    }

}
package com.tuoppi.boot.dao;

import com.tuoppi.boot.model.Product;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tuoppi
 */
@Repository
public class ProductDAOimpl implements ProductDAO {
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public Product getProduct(Product product) {
        return em.find(Product.class, product.getId());
    }

    @Override
    public Product getProduct(int id) {
        return em.find(Product.class, id);
    }

    @Override
    public Product saveProduct(Product product) {
        return em.merge(product);
    }

    @Override
    public Product removeProduct(Product product) {
        em.remove(em.merge(product));
        return product;
    }

    @Override
    public Product removeProduct(int id) {
        Product product = em.find(Product.class, id);
        em.remove(product);
        return product;
    }
    
}
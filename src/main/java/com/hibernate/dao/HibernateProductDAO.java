package com.hibernate.dao;

import com.app.Product;
import org.hibernate.SessionFactory;

import java.util.List;

public class HibernateProductDAO implements ProductDAO {

    // use generic DAO
    private DAO<Product> dao;

    public HibernateProductDAO(SessionFactory sessionFactory) {
        dao = new DAO<Product>(sessionFactory);
    }

    @Override
    public Product getById(Integer id) {
        return dao.getById(id);
    }

    public void save(Product product) {
        dao.save(product);
    }

    @Override
    public void delete(Product product) {
        dao.delete(product);
    }

    @Override
    public List<Product> getAll() {
        return dao.getAll(Product.class);
    }
}

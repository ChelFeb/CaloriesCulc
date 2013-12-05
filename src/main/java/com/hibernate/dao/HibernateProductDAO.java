package com.hibernate.dao;

import com.app.Product;
import com.app.User;
import com.app.UserProductSet;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class HibernateProductDAO implements ProductDAO {

    // use generic DAO
    private DAO<Product> dao;

    private SessionFactory sessionFactory;

    public HibernateProductDAO(SessionFactory sessionFactory) {
        dao = new DAO<Product>(sessionFactory);
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Product getById(Integer id) {

        Session session = sessionFactory.openSession();
        Product product = (Product) session.get(Product.class, id);

        return product;
    }


    @Override
    public Product ifUserExists(String login, String hashedPassowrd) {
        return null;
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

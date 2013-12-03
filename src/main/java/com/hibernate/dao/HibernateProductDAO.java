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
        Criteria userLookupCriteria = session.
                createCriteria(Product.class).
                add(Restrictions.eq("login", id));
        List usersList = userLookupCriteria.list();
        if (usersList.size() > 1){
            throw new IllegalStateException("More that one record with same username and password!");
        }

        return (Product) usersList.get(0);
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

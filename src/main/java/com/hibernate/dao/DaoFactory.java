package com.hibernate.dao;

import com.app.User;
import com.hibernate.HibernateUtil;
import org.hibernate.SessionFactory;

/**
 * Singleton
 */

public enum DaoFactory {

    INSTANCE;

    private UserDAO userDAO;
    private ProductDAO productDAO;


    // created once
    private SessionFactory sessionFactory;

    DaoFactory(){
        sessionFactory = HibernateUtil.getSessionFactory();

        productDAO = new HibernateProductDAO(sessionFactory);
        userDAO = new HibernateUserDAO(sessionFactory);

    }

    public ProductDAO getProductDAO() {
        return productDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }


}

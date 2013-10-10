package com.hibernate.dao;

import com.hibernate.HibernateUtil;
import org.hibernate.SessionFactory;

/**
 * Singleton
 */
public enum DaoFactory {

    INSTANCE;

    private ProductDAO productDAO;

    // created once
    private SessionFactory sessionFactory;

    DaoFactory(){
        sessionFactory = HibernateUtil.getSessionFactory();
        // all particular DAOs
        productDAO = new HibernateProductDAO(sessionFactory);
    }

    public ProductDAO getProductDAO() {
        return productDAO;
    }
}

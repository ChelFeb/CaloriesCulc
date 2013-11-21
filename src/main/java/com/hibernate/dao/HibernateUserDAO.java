package com.hibernate.dao;

import com.app.User;
import org.hibernate.SessionFactory;

public class HibernateUserDAO implements UserDAO {

    private DAO<User> dao;

    public User getById(Integer id) {
        return dao.getById(id);
    }

    public HibernateUserDAO(SessionFactory sessionFactory) {
        dao = new DAO<User>(sessionFactory);
    }

    public void delete(User name) {
        dao.delete(name);
    }

    public void save(User name) {
        dao.save(name);
    }
}

package com.hibernate.dao;

import com.app.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class HibernateUserDAO implements UserDAO {

    private DAO<User> dao;
    private SessionFactory sessionFactory;

    public User getById(Integer id) {
        Session session = sessionFactory.openSession();
        return (User) session.get(User.class, id);
    }

    public HibernateUserDAO(SessionFactory sessionFactory) {
        dao = new DAO<User>(sessionFactory);
        this.sessionFactory = sessionFactory;
    }

    public void delete(User name) {
        dao.delete(name);
    }

    public void save(User name) {
        dao.save(name);
    }

    @Override
    public boolean ifExists(String username, String password) {
        boolean result = false;
        Session session = sessionFactory.openSession();
        Criteria userLookupCriteria = session.
                createCriteria(User.class).
                add(Restrictions.eq("login", username)).
                add(Restrictions.eq("password", password));
        List usersList = userLookupCriteria.list();
        if (usersList.size() > 1){
            throw new IllegalStateException("More that one record with same username and password!");
        }
        if (usersList.size() != 0){
            result = true;
        }
        return result;
    }

    public User getUser(String username, String password) {
        Session session = sessionFactory.openSession();
        Criteria userLookupCriteria = session.
                createCriteria(User.class).
                add(Restrictions.eq("login", username)).
                add(Restrictions.eq("password", password));
        List usersList = userLookupCriteria.list();
        User user = null;
        Object userObject = usersList.iterator().next();
        if (usersList.size() > 1){
            throw new IllegalStateException("More that one record with same username and password!");
        }
        if (userObject instanceof User) {
            user = (User) userObject;
        } else {
            throw new IllegalStateException("this cannot be");
        }
        return user;
    }

    public Integer getUserId(String username) {
        Session session = sessionFactory.openSession();
        Criteria userLookupCriteria = session.
                createCriteria(User.class).
                add(Restrictions.eq("login", username));
        List usersList = userLookupCriteria.list();
        User user;
        Object userOjbect = usersList.iterator().next();
        if (userOjbect instanceof User) {
            user = (User) userOjbect;
        } else {
            throw new IllegalStateException("this cannot be");
        }
        return user.getId();
    }
}

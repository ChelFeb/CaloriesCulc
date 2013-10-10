package com.hibernate.dao;

import com.hibernate.entity.HibernateEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.LinkedList;
import java.util.List;

/**
 * Generic DAO that works for all objects of HibernateEntity subtype
 * @param <T>
 */
public class DAO <T extends HibernateEntity> {

    private SessionFactory sessionFactory;

    public DAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    T getById(Integer id){
        // TODO implement
        return null;
    }

    void save(T object){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(object); // save into DB (commit required)
        session.getTransaction().commit(); // commit all changes into DB
        session.close();
    }

    void delete(T object){
        // TODO implement
    }

    List<T> getAll(Class<T> type){
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(type);
        List criteriaResult = criteria.list();
        List<T> result = new LinkedList<T>();
        for (Object resultElement : criteriaResult){
            if (type.equals(resultElement.getClass())){
                T typeElement = (T)resultElement;
                result.add(typeElement);
            }
        }
        return result;
    }
}

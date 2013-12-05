package com.app;

import com.hibernate.HibernateUtil;
import com.hibernate.dao.DaoFactory;
import org.hibernate.Session;

import java.security.Principal;
import java.util.Date;

public class Main {
    public static void main(String [] args) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//
//        Product product1 = new Product();
//        product1.setProductName("Product22");
//        product1.setCarbohydrate(10);
//        product1.setFat(10);
//        product1.setKiloCalories(100);
//        product1.setProtein(5);
//        session.save(product1);
//
//        AddedProduct addedProduct = new AddedProduct(200, product1, 5);
//        addedProduct.setDate(new Date());
//
//        product1.getAddedProductSet().add(addedProduct);
//
//        session.save(addedProduct);
//
//
//        session.getTransaction().commit();

        System.out.println(DaoFactory.INSTANCE.getUserDAO().getUserId("toxa01"));
    }
}

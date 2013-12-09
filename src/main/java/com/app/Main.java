package com.app;

import com.hibernate.HibernateUtil;
import com.hibernate.dao.DaoFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static ArrayList<AddedProduct> exactProductListByDate(Date date, int userId) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Criteria userLookupCriteria = session.
                createCriteria(AddedProduct.class).
                add(Restrictions.ge("date", date)).
                add(Restrictions.eq("userId", userId));
        return (ArrayList<AddedProduct>) userLookupCriteria.list();
    }
    public static void main(String [] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        ArrayList<AddedProduct> list = exactProductListByDate(date, 1);
        for(AddedProduct p : list) {
            System.out.println(p.getProduct().getProductName());
        }
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
//        AddedProduct addedProduct = new AddedProduct(200, product1.getId(), 5);
//        addedProduct.setDate(new Date());
//
//      //  product1.getAddedProductSet().add(addedProduct);
//
//        session.save(addedProduct);
//
//
//        session.getTransaction().commit();

 //       System.out.println(DaoFactory.INSTANCE.getUserDAO().getUserId("toxa00"));


    }
}

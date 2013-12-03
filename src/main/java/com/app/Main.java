package com.app;

import com.hibernate.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

public class Main {
    public static void main(String [] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Product product = new Product();
        product.setProductName("Product");
        product.setCarbohydrate(10);
        product.setFat(10);
        product.setKiloCalories(100);
        product.setProtein(5);
        session.save(product);

        Product product1 = new Product();
        product1.setProductName("Product1");
        product1.setCarbohydrate(10);
        product1.setFat(10);
        product1.setKiloCalories(100);
        product1.setProtein(5);
        session.save(product1);

        AddedProduct addedProduct = new AddedProduct(200, product1);
        addedProduct.setDate(new Date());
        addedProduct.setUserId(1);

        product.getAddedProductSet().add(addedProduct);
        session.save(addedProduct);


        session.getTransaction().commit();
    }
}

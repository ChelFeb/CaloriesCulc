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

    public static void main(String [] args) {

        ArrayList<AddedProduct> productPerDayOfDae = AddedProduct.exactProductListByDate(new Date(), 1);
        DailyResultCalculator sumProductsPerDay = new DailyResultCalculator(productPerDayOfDae);
        System.out.println(sumProductsPerDay.getMass());
    }
}

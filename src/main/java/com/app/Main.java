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

        double d = 33.1993040000034;
        System.out.println(DailyResultCalculator.round(d));
    }
}

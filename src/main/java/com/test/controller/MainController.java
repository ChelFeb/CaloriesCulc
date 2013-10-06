package com.test.controller;


import com.app.AllProductsList;
import com.app.Product;
import com.hibernate.HibernateUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private static final Log LOG = LogFactory.getLog(MainController.class);

    @RequestMapping(value = "/app/", method = RequestMethod.GET)
    public String showMainPage(ModelMap model) {

        ArrayList<Product> list = new AllProductsList().getList();

        for ( int i = 0; i < list.size(); i ++) {
           model.addAttribute("productList", list);

           model.addAttribute("productKkal", list.get(i).getKiloCalories());
           model.addAttribute("productProtein", list.get(i).getProtein());
           model.addAttribute("productFat", list.get(i).getFat());
           model.addAttribute("productCarbohydrate", list.get(i).getCarbohydrate());
        }

        // params for JSP
        model.addAttribute("message", "Hello");
        return "main"; // name of JSP
    }

    @RequestMapping(value = "/profile/", method = RequestMethod.GET)
    public String showProfilePage(ModelMap model) {
        // params for JSP
        model.addAttribute("message", "Profile Page");
        return "profile"; // name of JSP
    }

    @RequestMapping(value="/add_text/", method = RequestMethod.POST)
    public void addNode(@RequestParam("add_text_value") String text) {
        System.err.println(text);

        // start work with DB
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        Product testProduct = new Product("Ham", 25.0, 15.0, 65.0, 5.0);
        // save into DB
        session.save(testProduct);

        // commit all changes into DB
        session.getTransaction().commit();

        // finish work with DB
        session.close();

        LOG.debug("product saved to DB");
    }

    @RequestMapping(value = "/products/", method = RequestMethod.GET)
    public String showManageProductsPage(ModelMap model) {

        // start work with DB
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        List<Product> products = session.createQuery("from Products").list();

        session.close();

        return "manage_products";
    }

}
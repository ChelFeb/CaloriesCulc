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
import org.springframework.web.portlet.ModelAndView;

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
    }

    @RequestMapping(value = "/products/", method = RequestMethod.GET)
    public String showManageProductsPage(ModelMap model) {

        // start work with DB
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Product> products = session.createQuery("from Product").list();
        session.close();

        model.addAttribute("productList", products);

        return "manage_products";
    }

    @RequestMapping(value = "/products/add/", method = RequestMethod.POST)
    public ModelAndView addProduct(
            @RequestParam("productName") String productName,
            @RequestParam("calories") String calories,
            @RequestParam("protein") String protein,
            @RequestParam("fat") String fat,
            @RequestParam("carbohydrate") String carbohydrate
            ) {

        LOG.debug("started");

        Double caloriesDouble = Double.parseDouble(calories);
        Double proteinDouble = Double.parseDouble(protein);
        Double fatDouble = Double.parseDouble(fat);
        Double carbohydrateDouble = Double.parseDouble(carbohydrate);

        Product newProduct = new Product(productName, caloriesDouble, proteinDouble, fatDouble, carbohydrateDouble);

        // work with DB
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(newProduct); // save into DB (commit required)
        session.getTransaction().commit(); // commit all changes into DB
        session.close();

        // redirect
        LOG.debug("redirecting back...");
        return new ModelAndView("redirect:/products/");
    }

}
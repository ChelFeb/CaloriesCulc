package com.test.controller;


import com.app.AllProductsList;
import com.app.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainController {

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

}
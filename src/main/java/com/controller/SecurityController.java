package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecurityController {

    @RequestMapping(value = "/login/", method = RequestMethod.GET)
    public String accessPublicPage(Model model) {
        model.addAttribute("message", "This page is publicly accessible. No authentication is required to view.");
        return "login";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String signin() {
        return "/secured/user/main";
    }

}

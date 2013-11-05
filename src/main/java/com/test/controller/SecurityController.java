package com.test.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class SecurityController {

    @RequestMapping("/login/")
    public String accessPublicPage(Model model) {
        model.addAttribute("message", "This page is publicly accessible. No authentication is required to view.");
        return "/login/";
    }

}

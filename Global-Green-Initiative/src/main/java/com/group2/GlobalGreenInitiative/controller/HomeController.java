package com.group2.GlobalGreenInitiative.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/homepage")
public class HomeController {

    @GetMapping("/new")
    public String displayHomepage() {
        return "homepage/homepage";
    }
}

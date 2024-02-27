package com.group2.GlobalGreenInitiative.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/submitted")
public class SubmittedController {

    @GetMapping("/new")
    public String displaySubmitted() {
        return "submitted/submitted";
    }
}

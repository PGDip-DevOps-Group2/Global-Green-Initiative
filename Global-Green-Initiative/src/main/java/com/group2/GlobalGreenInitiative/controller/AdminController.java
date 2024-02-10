package com.group2.GlobalGreenInitiative.controller;

import com.group2.GlobalGreenInitiative.dao.CustomerRepository;
import com.group2.GlobalGreenInitiative.dao.GrantRepository;
import com.group2.GlobalGreenInitiative.entities.Customer;

import com.group2.GlobalGreenInitiative.entities.Grant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    CustomerRepository customerRepo;

    @Autowired
    GrantRepository grantRepo;

    @GetMapping("/")
    public String displayAdmin(Model model) {
        List<Customer> customers = customerRepo.findAll();
        model.addAttribute("customers", customers);

        List<Grant> grant = grantRepo.findAll();
        model.addAttribute("grant", grant);
        return "admin";
    }



}

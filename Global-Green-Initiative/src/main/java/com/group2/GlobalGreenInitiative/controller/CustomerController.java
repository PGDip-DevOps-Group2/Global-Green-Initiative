package com.group2.GlobalGreenInitiative.controller;

import com.group2.GlobalGreenInitiative.entities.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/new")
    public String displayCustomerForm(Model model) {

        Customer aCustomer = new Customer();

        model.addAttribute("customer", aCustomer);
        return "customer/customer";
    }
}

package com.group2.GlobalGreenInitiative.controller;

import com.group2.GlobalGreenInitiative.dao.CustomerRepository;
import com.group2.GlobalGreenInitiative.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/new")
    public String displayCustomerForm(Model model) {

        Customer aCustomer = new Customer();

        model.addAttribute("customer", aCustomer);
        return "customer";
    }

    @PostMapping("/save")
    public String createCustomer(Customer customer, Model model) {
        customerRepository.save(customer);

        return "redirect:/Home/new";
    }
}

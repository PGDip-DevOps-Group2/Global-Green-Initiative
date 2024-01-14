package com.group2.group2.controller;
import com.group2.group2.dao.GrantRepository;
import com.group2.group2.entities.Customer;
import com.group2.group2.entities.Grant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/grants")
public class GrantController {

    @GetMapping("/new")
    public String displayGrantOptions(Model model) {

        Grant aGrant = new Grant();

        model.addAttribute("grant", aGrant);
        return "grant";
        }
    }

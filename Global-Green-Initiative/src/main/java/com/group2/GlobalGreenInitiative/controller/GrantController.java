package com.group2.GlobalGreenInitiative.controller;
import com.group2.GlobalGreenInitiative.dao.GrantRepository;
import com.group2.GlobalGreenInitiative.entities.Grant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/grants")
public class GrantController {

    @Autowired
    GrantRepository grantRepository;

    @GetMapping("/new")
    public String displayGrantOptions(Model model) {

        Grant aGrant = new Grant();

        model.addAttribute("grant", aGrant);
        return "grant/grant";
        }

    @PostMapping("/save")
    public String saveGrantOptions(Model model, Grant grant) {
        grantRepository.save(grant);

        return "redirect:/customers/new";
    }
    }

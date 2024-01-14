package com.group2.GlobalGreenInitiative.controller;
import com.group2.GlobalGreenInitiative.entities.Grant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

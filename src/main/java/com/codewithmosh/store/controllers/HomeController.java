package com.codewithmosh.store.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/Home")
    public String index (Model model){
        model.addAttribute("name", "Kelly");
      return "index";
    };


}

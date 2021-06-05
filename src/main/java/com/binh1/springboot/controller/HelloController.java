package com.binh1.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
	// display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model) {
        return "index";
    }

}

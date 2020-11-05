package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FourController {
    @GetMapping("/four")
    public String indexpagee(Model model){
        model.addAttribute("username","优就业");
        model.addAttribute("href","http://www.ujiuye.com");
        return "index4";
    }
}

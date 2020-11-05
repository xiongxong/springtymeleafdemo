package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class FirsthyleafController {
    @GetMapping("/first")
    public String indexPage(Model model){
        String message="hello,中公";
        model.addAttribute("messagee",message);
        return "index";
    }
}

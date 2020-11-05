package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.jws.WebParam;
import java.util.Date;

@Controller
public class FIveController {
    @GetMapping("/five")
    public String indexPage(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manage","manage");
        return "index5";
    }
    @GetMapping("/six")
    public  String indexPafe(Model model){
        return "index6";
    }
    @GetMapping("/seven")
    public String indexpa(Model model){
        Date date=new Date();
        model.addAttribute("date",date);
        double price=128.44;
        model.addAttribute("price",price);
        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;
    model.addAttribute("strtext",str);
//定义字符串
        String str2="JAVA-offcn";
        model.addAttribute("str2", str2);
        return "index7";

    }
}

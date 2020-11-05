package com.offcn.controller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    @GetMapping("/second")
    public String getSecondPage(Model model){
        String message="hello,优就业";
        model.addAttribute("message",message);

        User user=new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(18);
//        User user2=new User();
//        user2.setId(1);
//        user2.setName("李四");
//        user2.setAge(18);
//        User user3=new User();
//        user3.setId(1);
//        user3.setName("王五");
//        user3.setAge(18);


        Map<String ,Object> map=new HashMap<>();
        map.put("src4","4.jpg");
        map.put("src5","5.jpg");

        model.addAttribute("user",user);
        model.addAttribute("src",map);
        return "index2";
    }
}

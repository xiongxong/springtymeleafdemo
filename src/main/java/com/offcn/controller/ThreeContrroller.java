package com.offcn.controller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThreeContrroller {
    @GetMapping("/three")
    public String indexPage(Model model){
        List<User> userList=new ArrayList<>();
        User user=new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(18);
        User user2=new User();
        user2.setId(1);
        user2.setName("李四");
        user2.setAge(18);
        User user3=new User();
        user3.setId(1);
        user3.setName("王五");
        user3.setAge(18);
        userList.add(user);
        userList.add(user3);
        userList.add(user2);
        model.addAttribute("userlist",userList);
        return "index3";
    }
}

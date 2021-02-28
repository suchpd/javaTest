package com.such.controller;

import com.such.entity.User;
import com.such.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("creat")
    public void creat(){
        User user = new User();
        user.setUserName("admin");
        user.setPassword("123456");
        user.setName("admin");
        userService.create(user);
    }
}

package com.such.controller;

import com.github.pagehelper.PageInfo;
import com.such.entity.User;
import com.such.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("delete")
    public void delete(Integer id){
       userService.delete(id);
    }

    @GetMapping("update")
    public void update(){
        User user = new User();
        user.setUserName("adminxxx");
        user.setPassword("123456xxx");
        user.setName("adminxxx");
        user.setPhone("13020758417");
        user.setId(1);
        userService.update(user);
    }

    @GetMapping("detail")
    public User detail(Integer id){
        return userService.detail(id);
    }

    @GetMapping("query")
    public PageInfo<User> query(User user){
        return userService.query(user);
    }

}

package com.such.service;

import com.such.entity.User;
import com.such.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int create(User user){
        return userMapper.create(user);
    }
}

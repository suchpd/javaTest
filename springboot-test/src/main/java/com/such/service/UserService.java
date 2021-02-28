package com.such.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.such.entity.User;
import com.such.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /*新增*/
    public int create(User user){
        return userMapper.create(user);
    }

    /*删除*/
    public int delete(Integer id){
        return userMapper.delete(id);
    }

    /*编辑*/
    public int update(User user){
        return userMapper.update(user);
    }

    /*查询*/
    public PageInfo<User> query(User user){
        if (user !=null && user.getPage() != null){
            PageHelper.startPage(user.getPage(),user.getLimit());
        }

        PageInfo<User> pageInfo = new PageInfo<>(userMapper.query(user));
        return pageInfo;
    }

    /*详情*/
    public User detail(Integer id){
        return userMapper.detail(id);
    }

}

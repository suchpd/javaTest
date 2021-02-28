package com.such.mapper;

import com.such.entity.User;

import java.util.List;

public interface UserMapper {

    /*新增*/
    int create(User user);

    /*删除*/
    int delete(Integer id);

    /*编辑*/
    int update(User user);

    /*查询*/
    List<User> query(User user);

    /*详情*/
    User detail(Integer id);
}

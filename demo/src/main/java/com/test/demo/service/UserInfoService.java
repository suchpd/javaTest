package com.test.demo.service;

import com.test.demo.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    //    新增用户
    void addUser();

    //    获取用户信息
    List<UserInfo> getAllUser();
}

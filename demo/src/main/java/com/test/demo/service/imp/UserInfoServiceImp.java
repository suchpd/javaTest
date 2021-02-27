package com.test.demo.service.imp;

import com.test.demo.domain.UserInfoDomain;
import com.test.demo.entity.UserInfo;
import com.test.demo.service.UserInfoService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImp implements UserInfoService {
    @Autowired
    private UserInfoDomain userInfoDomain;

    @Override
    public void addUser() {
        userInfoDomain.addUser();
    }

    @Override
    public List<UserInfo> getAllUser() {
        var userInfos = userInfoDomain.getAllUser();
        return userInfos;
    }
}

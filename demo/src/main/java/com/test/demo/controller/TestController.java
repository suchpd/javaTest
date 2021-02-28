package com.test.demo.controller;

import com.test.demo.entity.TestModel;
import com.test.demo.entity.UserInfo;
import com.test.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "test")
public class TestController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping(value = "getStudent")
    public List<TestModel> getStudentMap() {
        TestModel stu1 = new TestModel("stu1", 1, "男");
        TestModel stu2 = new TestModel("stu2", 2, "女");
        TestModel stu3 = new TestModel("stu3", 3, "男");

        List<TestModel> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        return list;
    }


    @GetMapping(value = "getUser")
    public List<UserInfo> list() {

        return userInfoService.getAllUser();
//        String sql = "SELECT * FROM userInfo";
//        List<UserInfo> userList = jdbcTemplate.query(sql, new RowMapper<UserInfo>() {
//            UserInfo user = null;
//
//            @Override
//            public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
//                user = new UserInfo();
//                user.setId(rs.getInt("Id"));
//                user.setUserName(rs.getString("UserName"));
//                user.setPassWord(rs.getString("PassWord"));
//                return user;
//            }
//        });
//        for (UserInfo user : userList) {
//            System.out.println(user.toString());
//        }
//        return userList;
    }

    @PostMapping(value = "addUser")
    public String addUser() {
        userInfoService.addUser();
        return "新增成功";
//        String sql = "Insert Into UserInfo (Id,UserName,PassWord) Value (1,'maomao','123456')";
//
//        jdbcTemplate.update(sql);
//        System.out.println("新增成功！");
    }
}

package com.test.demo.domain;

import com.test.demo.entity.UserInfo;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserInfoDomain {
        @Autowired
        private JdbcTemplate jdbcTemplate;

        public void addUser(){
                String countSql = "Select count(1) From UserInfo";
                int count = jdbcTemplate.queryForObject(countSql,Integer.class);
                count++;
                String sql = "Insert Into UserInfo (Id,UserName,PassWord) Value (" + count + ",'maomao','123456')";
                jdbcTemplate.update(sql);
        }

        public List<UserInfo> getAllUser(){
                String sql = "SELECT * FROM userInfo";

                List<UserInfo> userList = jdbcTemplate.query(sql, new RowMapper<UserInfo>() {
                        UserInfo user = null;

                        @Override
                        public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
                                user = new UserInfo();
                                user.setId(rs.getInt("Id"));
                                user.setUserName(rs.getString("UserName"));
                                user.setPassWord(rs.getString("PassWord"));
                                return user;
                        }
                });
                for (UserInfo user : userList) {
                        System.out.println(user.toString());
                }
                return userList;
        }
}

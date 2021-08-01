package com.atgugui.test;

import com.atgugui.service.UserService;
import com.atgugui.service.UserServiceImpl;
import org.junit.Test;
import pojo.User;

import java.io.IOException;
import java.sql.SQLException;

public class UserServiceTest {
    UserService userService=new UserServiceImpl();
    @Test
    public void loginUser() throws SQLException, IOException, ClassNotFoundException {
        System.out.println(userService.loginUser(new User(8,"lixin","972417","1915925016")));
    }

    @Test
    public void registUser() throws SQLException, IOException, ClassNotFoundException {
        userService.registUser(new User(9,"lixin2","972417","1915925016"));
    }

    @Test
    public void existsUsername() throws SQLException, IOException, ClassNotFoundException {
        if (userService.existsUsername("wzg168")) {
            System.out.println("用户名已存在");
        } else {
            System.out.println("用户名可用！");
        }
    }
}
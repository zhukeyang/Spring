package com.atgugui.test.impl;



import impl.com.atgugui.dao.impl.UserDao;
import impl.com.atgugui.dao.impl.UserDaoImpl;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

public class UserDaoTest {

    @Test
    public void queryUserByUsername() throws SQLException, IOException, ClassNotFoundException {

        UserDao userDao =  new UserDaoImpl();
        if(userDao.queryUserByUsername("username")==null)
        {
            System.out.println("用户名可用");
        }
        else {
            System.out.println("用户名已存在");
        }
    }

    @Test
    public void queryUserByUsernameAndPassword() throws SQLException, IOException, ClassNotFoundException {
        UserDao userDao =new UserDaoImpl();
        if (userDao.queryUserByUsernameAndPassword("lixin","972417")==null)
        {
            System.out.println("用户名或密码错误，登陆失败");
        }
        else
        {
            System.out.println("查询成功");
        }
    }

    @Test
    public void saveUser() {
        UserDao userDao =new UserDaoImpl();

    }

}
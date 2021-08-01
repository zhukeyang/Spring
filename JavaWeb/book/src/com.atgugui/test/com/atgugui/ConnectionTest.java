package com.atgugui;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionTest {

    public void getConnection5() throws IOException, ClassNotFoundException, SQLException {
        InputStream is= JDBCUtils.class.getClassLoader().getResourceAsStream("D:\\JavaWeb\\book\\src\\main\\resources\\jdbc.properties");
        Properties properties= new Properties();
        properties.load(is);
        String username= properties.getProperty("username");
        String password= properties.getProperty("password");
        String url= properties.getProperty("url");
        String driverClassName= properties.getProperty("driverClassName");
        //加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection= DriverManager.getConnection(url,username,password);
        if(connection==null)
        {
            System.out.println("成功");
        }
        else {
            System.out.println("不成功");
        }
    }
}

package com.atgugui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver"); //反射
        //2.获得连接对象
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
        if (connection!=null)
        {
            System.out.println("连接成功");
        }
        else
        {
            System.out.println("不成功");
        }
        return connection;
    }
    //参数时驱动类的路径

//    public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
//        InputStream is= JDBCUtils.class.getClassLoader().getResourceAsStream("src/jdbc.properties");
//        Properties properties= new Properties();
//        properties.load(is);
//        String username= properties.getProperty("username");
//        String password= properties.getProperty("password");
//        String url= properties.getProperty("url");
//        String driverClassName= properties.getProperty("driverClassName");
//        //加载驱动
//        Class.forName("oracle.jdbc.OracleDriver");
//        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
//        if(connection==null)
//        {
//            System.out.println("成功");
//        }
//        else {
//            System.out.println("不成功");
//        }
//        System.out.println(connection);
//        return connection;
//    }

}

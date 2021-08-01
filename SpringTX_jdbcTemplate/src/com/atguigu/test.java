package com.atguigu;

import com.atguigu.bean.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class test {
    ApplicationContext ioc= new ClassPathXmlApplicationContext("ApplicationContext.xml");
    JdbcTemplate jdbcTemplate = ioc.getBean(JdbcTemplate.class);
    private Object RowMapper;

    @Test
    public void test02()
    {
        String sql="UPDATE employee SET salary=? WHERE emp_id=?";
        int update = jdbcTemplate.update(sql, 1300, 5);
        System.out.println("更新员工影响了"+update+"行");
    }
    @Test
    public void test03()
    {
        String sql="SELECT emp_id empID,emp_name empName,salary FROM employee WHERE emp_id=?";
        //queryForObject查询单个对象,无论是返回单个对象还是单个数据，都是调用queryForObject
        Employee employee = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class), 5);
        System.out.println(employee);
    }
    @Test
    public void test01() throws SQLException {
        DataSource bean = (DataSource) ioc.getBean("dataSource");
        Connection connection = bean.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    public void test04()
    {
        Employee bean = ioc.getBean(Employee.class);
        Employee employee=new Employee();
        employee.setEmpName("haha ");
        employee.setSalary(999.33);
        System.out.println(employee);
    }
}

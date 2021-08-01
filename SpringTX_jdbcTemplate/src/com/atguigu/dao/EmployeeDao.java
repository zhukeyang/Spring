package com.atguigu.dao;

import com.atguigu.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public void saveEmployee(Employee employee)
    {
        String sql="SELECT emp_id empID,emp_name empName,salary FROM employee WHERE emp_id=?";
        jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Employee.class),5);

    }
}

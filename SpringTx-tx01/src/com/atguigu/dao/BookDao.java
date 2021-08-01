package com.atguigu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public void updateBalance(String userName,int price)
    {
        String sql= "update account SET balance=balance-? WHERE username=?";
        jdbcTemplate.update(sql,price,userName);
    }
    public int getPrice(String isbn)
    {
        String sql="SELECT price from book where book=?";
        return  jdbcTemplate.queryForObject(sql,Integer.class,isbn);

    }
    public void updateStock(String isbn)
    {
        String sql="UPDATE book_stock SET stock=stock-1 WHERE isbn=?";
        jdbcTemplate.update(sql,isbn);
    }
}

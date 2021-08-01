package com.atgugui.service.impl;
import pojo.User;

import java.io.IOException;
import java.sql.SQLException;

public interface UserService {


public User loginUser(User user) throws SQLException, IOException, ClassNotFoundException;
public void registUser(User user) throws SQLException, IOException, ClassNotFoundException;




    public boolean existsUsername(String username) throws SQLException, IOException, ClassNotFoundException;
}

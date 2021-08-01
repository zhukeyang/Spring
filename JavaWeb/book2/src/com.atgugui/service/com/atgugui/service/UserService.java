package com.atgugui.service;

import pojo.User;
import java.io.IOException;
import java.sql.SQLException;

public interface UserService {

    public void registUser(User user) throws SQLException, IOException, ClassNotFoundException;
    public String loginUser(User user);





    public boolean existsUsername(String username) throws SQLException, IOException, ClassNotFoundException;
}

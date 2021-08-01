package impl.com.atgugui.dao.impl;

import pojo.User;

import java.io.IOException;
import java.sql.SQLException;

public interface UserDao {

    public User queryUserByUsername(String name) throws SQLException, IOException, ClassNotFoundException;
    public User queryUserByUsernameAndPassword(String name, String password) throws SQLException, IOException, ClassNotFoundException;

    public int saveUser(User user) throws SQLException, IOException, ClassNotFoundException;
}

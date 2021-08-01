package impl;

import pojo.User;

import java.io.IOException;
import java.sql.SQLException;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User queryUserByUsername(String username) throws SQLException, IOException, ClassNotFoundException {
        String sql="select id,username,password,email from t_user where username=?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) throws SQLException, IOException, ClassNotFoundException {
        String sql="select id,username,password,email from t_user where username= ? and password =?";
        return queryForOne(User.class,sql,username,password);
    }

    @Override
    public int saveUser(User user) throws SQLException, IOException, ClassNotFoundException {
        String sql="insert into t_user(id,username,password,email) values(?,?,?,?)";
        return update(sql,user.getId(),user.getUsername(),user.getPassword(),user.getEmail());
    }


}

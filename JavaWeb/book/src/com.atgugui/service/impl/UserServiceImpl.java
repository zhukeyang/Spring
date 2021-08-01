package impl;

import  com.atgugui.service.impl.UserService;
import impl.com.atgugui.dao.impl.UserDao;
import impl.com.atgugui.dao.impl.UserDaoImpl;
import pojo.User;
import java.io.IOException;
import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    private UserDao userDao =new UserDaoImpl();





    @Override
    public User loginUser(User user) throws SQLException, IOException, ClassNotFoundException {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public void registUser(User user) throws SQLException, IOException, ClassNotFoundException {
         userDao.saveUser(user);

    }



    @Override
    public boolean existsUsername(String username) throws SQLException, IOException, ClassNotFoundException {
        if(userDao.queryUserByUsername(username)==null)
        {
            return false;
        }
        else {
            return true;
        }

    }
}

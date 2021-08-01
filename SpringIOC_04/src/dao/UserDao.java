package dao;

import bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User>{
    @Override
    public void save() {
        System.out.println("UserDao保存用户");
    }
}

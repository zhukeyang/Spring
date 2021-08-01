package impl;
import java.io.IOException;
import java.sql.SQLException;

public interface UserDao {

    public pojo.User queryUserByUsername(String name) throws SQLException, IOException, ClassNotFoundException;
    public pojo.User queryUserByUsernameAndPassword(String name, String password) throws SQLException, IOException, ClassNotFoundException;


   public int saveUser(pojo.User user) throws SQLException, IOException, ClassNotFoundException;
}

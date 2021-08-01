import com.atgugui.service.impl.UserService;
import impl.UserServiceImpl;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
    private UserService userService=new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String username= req.getParameter("username");
       String password= req.getParameter("password");
        User loginUser= null;
        try {
            loginUser = userService.loginUser(new User(null,username,password,null));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (loginUser!=null)
       {
           System.out.println("用户名或密码错误");
           req.getRequestDispatcher("web/pages/user/login.html").forward(req,resp);
       }
       else
       {
           req.getRequestDispatcher("web/pages/user/login_success.html").forward(req,resp);
       }
    }
}

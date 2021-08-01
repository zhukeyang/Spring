import com.atgugui.service.impl.UserService;
import impl.UserServiceImpl;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

public class RegistServlet extends HttpServlet {
    Random ra =new Random();
    private UserService userService =new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username= req.getParameter("username");
        String password= req.getParameter("password");
        String email= req.getParameter("email");
        String code= req.getParameter("code");
        if ("abcde".equalsIgnoreCase(code))
        {


            try {
                if (userService.existsUsername(username)) {
                    System.out.println("用户名已存在");
                    req.getRequestDispatcher("web/pages/user/login.html").forward(req,resp);
                }
                else {

                        userService.registUser(new User((ra.nextInt(100)),username,password,email));
                        req.getRequestDispatcher("web/pages/user/regist_success.html").forward(req,resp);
                }
            } catch (SQLException throwables) {
                System.out.println("catch");
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("结束");
            }


        }
        else {
            System.out.println("验证码错误");
            req.getRequestDispatcher("http://localhost:8082/book1_war_exploded/web/pages/user/regist.html").forward(req,resp);
        }



    }
}

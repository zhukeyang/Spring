import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //获取请求参数
        String username= req.getParameter("username");
        System.out.println("在Servlet1柜台1中查看参数"+username);
        //给材料盖章，并传递到Servlet2
        req.setAttribute("key","柜台1的章");
        //问路：Servlet2怎么走
        /*
        * 请求转发必须要有斜杠打头，斜杠表示地址为：http://ip:port/工程名,映射到IDEA代码的web目录
        * */
        RequestDispatcher requestDispatcher =req.getRequestDispatcher("/servlet2");
        //走向Servlet2（柜台2）
        requestDispatcher.forward(req,resp);
    }
}

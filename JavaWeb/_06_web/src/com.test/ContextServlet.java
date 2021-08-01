import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //1.获取web.xml中配置文件的上下文参数context-param
       ServletContext context= getServletConfig().getServletContext();
       String username=context.getInitParameter("username");
        System.out.println(context.getInitParameter(username));
    //2.获取当前工程路径，格式：/工程路径
        System.out.println(context.getContextPath());
    //3.获取工程部署后在服务器硬盘上的绝对路径
        System.out.println(context.getRealPath("/"));
    }
}

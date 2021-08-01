import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("曾到此已有Response1");
        //设置响应状态码：表示重定向
        resp.setStatus(302);
        //设置响应头说明新的地址
        resp.setHeader("Location","http://localhost:8082/_08_servlet_war_exploded/response2");
    }
}

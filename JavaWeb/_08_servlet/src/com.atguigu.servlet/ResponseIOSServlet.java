import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOSServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(resp.getCharacterEncoding());//ISO-8859_1默认 不支持中文
//      resp.getOutputStream();
//      两个流同时只能用一个
        //设置字符集为UTF-8
        resp.setCharacterEncoding("UTF-8");
        //通过响应头，设置浏览器也使用UTF-8字符集
        resp.setHeader("Content-Type","charset=UTF-8");
        PrintWriter writer =resp.getWriter();
        writer.write("response.content");
    }
}

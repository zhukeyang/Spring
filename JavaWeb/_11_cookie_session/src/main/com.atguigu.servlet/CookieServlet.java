import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends BaseServlet{

    protected void createcookie(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cookie cookie =new Cookie("key1","value1");
        //通知客户端保存cookie
        //cookie是保存到客户端
        resp.addCookie(cookie);
        resp.getWriter().write("Cookie创建成功");
    }
    protected void getcookie(HttpServletRequest req, HttpServletResponse resp) throws IOException
    {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            resp.getWriter().write("Cookie");
        }
    }
}

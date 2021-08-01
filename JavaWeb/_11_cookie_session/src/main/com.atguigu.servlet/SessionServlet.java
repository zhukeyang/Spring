import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionServlet extends BaseServlet{
    protected void setAttribute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //往session中保存数据
        request.getSession().setAttribute("key1","value1");
    }
    protected void getAttribute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //获取session域中的数据
         Object object= request.getSession().getAttribute("key1");
         response.getWriter().write("从session中获取key1的数据是："+object);
    }


    protected void createOrgetsession(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建和获取Session会话对象
        HttpSession session= request.getSession();
        //判断当前session会话，是否是新创建出来的
        boolean isNew = session.isNew();
        //获取session会话的唯一标识
        String id =session.getId();
        response.getWriter().write("得到的session，它的ID是"+id);
        response.getWriter().write("这个session是新创建的"+isNew);
    }
}

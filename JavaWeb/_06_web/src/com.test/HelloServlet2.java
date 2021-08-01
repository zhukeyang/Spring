import javax.servlet.*;
import java.io.IOException;

public class HelloServlet2 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        System.out.println("init方法");
        /*
        ServletConfig是Servlet的配置信息
        * 1.可以获取Servlet程序的别名servlet-name的值

        * 2.获取初始化参数init_param
        * 3.获取ServletContext对象
        *
        * */
        System.out.println("HelloServlet程序的别名："+servletConfig.getServletName());
        System.out.println(servletConfig.getInitParameter("scott"));
        System.out.println(servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("成功访问");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

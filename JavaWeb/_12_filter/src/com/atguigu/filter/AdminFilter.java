package com.atguigu.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AdminFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("2.Filter的Init初始化");
        System.out.println("filter-name的值是"+filterConfig.getFilterName());
        System.out.println("初始化参数username的值是："+filterConfig.getInitParameter("username"));
        System.out.println("初始化参数username的值是："+filterConfig.getInitParameter("url"));
        System.out.println(filterConfig.getServletContext());
    }
//  专门用于拦截请求过滤响应，可以做权限检查
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest=(HttpServletRequest) servletRequest;
        HttpSession session=null;
        Object user= session.getAttribute("user");
        if (user ==null)
        {
            servletRequest.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
            return;
        }
        else
        {
            //让程序继续往下访问（放行）
            //如果没有这一行代码，程序不会往下走，会是一片空白，千万不能忘记
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}

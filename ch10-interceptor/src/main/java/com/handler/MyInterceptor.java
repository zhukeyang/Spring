package com.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.annotation.HandlesTypes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* 拦截器
*
*
* */
@Component
public class MyInterceptor implements HandlerInterceptor {
   /*
   * 预处理方法preHandle，预先处理请求的方法
   *    参数：
   *        Object handler：被拦截的控制器对象(MyController)
   *        返回值是一个:boolean
   *            true:请求是正确的，可以被controller处理
   *            false:请求不能被处理，控制器方法不会执行
   *    特点：
   *        1.预处理方法执行的时间是在控制器方法之前先执行的。
   *        2.可以对请求做处理，可以做登录的检查，权限的判断，统计数据等
   *        3.决定请求是否执行
   * */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor拦截器的preHandle");
        return true;

    }

    /*
    *postHandle：后处理方法
    * 参数：Object handler：被拦截的控制器对象(MyController)
    *      ModelAndView mv:控制器方法的返回值（请求的执行结果）
    *
    * 特点：
    *     1.在控制器方法之后执行的
    *     2.能获取到控制器方法的执行结果，可以修改原来的执行结果
    *       可以修改数据，也可以修改视图
    *     3.可以看做是对请求的二次处理。
    *
    * */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mv) throws Exception {
        System.out.println("MyInterceptor拦截器的postHandle");
    }

    /*
    * afterCompletion:最后执行的方法
    * 方法参数：Object handler：被拦截的控制器对象(MyController)
    *         Exception ex:方法执行过程中抛出的异常
    * 特点：
    *   1.在请求处理完成后执行的，请求处理完成的标志是视图处理的完成，对视图执行forward操作后
    *   2.可以做程序最后要做的工作，释放内存，清理临时变量。
    *   3.方法的执行条件
    *       1.当前的拦截器的preHandle()方法必须执行
    *       2.preHandle()方法必须返回true
    *
    *
    * */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor拦截器的afterHandle");
    }
}

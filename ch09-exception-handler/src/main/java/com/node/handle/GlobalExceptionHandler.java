package com.node.handle;


import com.node.exception.AgeException;
import com.node.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/*
* @ControllerAdvice表示是一个异常处理类，给Controller增强功能的
* 位置：类的上面
*
* */
@ControllerAdvice
public class GlobalExceptionHandler {
    //定义处理异常的方法
    //方法的定义和Controller类中方法的定义


    /*
    * 处理nameException类型的异常
    *参数:
    *   Exception：表示Controller抛出的异常对象
    *@ExceptionHandler：用来表示此方法来处理异常
    *       属性：value 异常的类型。
    *       位置：方法的上面
    * */
    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception e)
    {
        /*
        * 发生异常：
        * 1.我们可以记录异常，记录日志文件
        * 2.发送通知，邮件，短信等
        * 3.给用户友好的提示
        * */
        System.out.println("doNameException=="+e);
        ModelAndView mv=new ModelAndView();
        mv.addObject("tips","姓名只能是张三");
        mv.setViewName("nameError");
        return mv;
    }
    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeException(Exception e)
    {
        /*
         * 发生异常：
         * 1.我们可以记录异常，记录日志文件
         * 2.发送通知，邮件，短信等
         * 3.给用户友好的提示
         * */
        System.out.println("doAgeException=="+e);
        ModelAndView mv=new ModelAndView();
        mv.addObject("tips","年龄不能大于80");
        mv.setViewName("ageError");
        return mv;
    }
    //处理其他异常
    @ExceptionHandler
    public ModelAndView doOtherException(Exception e)
    {
        /*
         * 发生异常：
         * 1.我们可以记录异常，记录日志文件
         * 2.发送通知，邮件，短信等
         * 3.给用户友好的提示
         * */
        System.out.println("doOtherException=="+e);
        ModelAndView mv=new ModelAndView();
        mv.addObject("tips","请稍后重试");
        mv.setViewName("DefaultError");
        return mv;
    }
}

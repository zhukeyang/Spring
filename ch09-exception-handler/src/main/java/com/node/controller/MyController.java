package com.node.controller;

import com.node.domain.Student;
import com.node.exception.AgeException;
import com.node.exception.MyUserException;
import com.node.exception.NameException;
import com.node.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/student")
public class MyController {

    /*
    * 声明引用类型，调用引用类型的方法
    *
    * */

    @Autowired
    private StudentService service;
    @RequestMapping("/some.do")
    public ModelAndView dosome(String name,Integer age) throws MyUserException {
        System.out.println("执行了MyController的doSome方法");
        //抛出异常
        if(!"zs".equals(name))
        {
            throw new NameException("姓名不正确");

        }
        if (age==null||age.intValue()>80)
        {
            throw new AgeException("年龄太大");
        }
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname","name");
        mv.addObject("myage","age");
        mv.setViewName("result");

        return mv;
    }

}

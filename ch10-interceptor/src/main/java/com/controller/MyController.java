package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    /*
    * 声明引用类型，调用引用类型的方法
    *
    * */

    @Autowired
    @RequestMapping("/some.do")
    public ModelAndView dosome(String name,Integer age){
        System.out.println("执行了MyController的doSome方法");
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname","name");
        mv.addObject("myage","age");
        mv.setViewName("result");

        return mv;
    }

}

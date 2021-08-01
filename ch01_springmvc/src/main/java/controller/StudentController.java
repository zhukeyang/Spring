package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @RequestMapping("/add.do")
    public ModelAndView addStudent()
    {
        System.out.println("add.do执行成功");
        ModelAndView mv =new ModelAndView();
        mv.addObject("msg","注册成功");
        mv.setViewName("show");
        return mv;
    }
}

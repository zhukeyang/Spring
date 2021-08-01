package com.node.controller;

import com.node.domain.Student;
import com.node.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    /*
    * 声明引用类型，调用引用类型的方法
    *
    * */


    @Qualifier("studentServiceImpl")
    @Autowired
    private StudentService service;
    @RequestMapping("/addStudent.do")
    public ModelAndView insertStudent(Student student)
    {
        ModelAndView mv=new ModelAndView();
        int rows = service.addStudent(student);
        String msg="注册失败";
        if (rows>0)
        {
            msg="注册成功";
            System.out.println("注册成功，");
        }
        else
        {
            System.out.println(msg);
        }
        mv.addObject("msg",student.getName()+","+msg);
        mv.setViewName("result");

        return mv;
    }
    //浏览的学生
    //@ResponseBody注解是将java对象转成json
    @RequestMapping("/queryStudent.do")
    @ResponseBody
    public List<Student> queryStudent()
    {
        List<Student> students = service.queryStudents();
        return students;
    }
}

package Servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.BookService;
/*
* 属性的自动注解
* @Autowired：spring会自动的为属性赋值（不用担心空指针异常）
*           一定是去容器中找到这个属性对应的组件
* */
@Controller
public class BookServlet {
    //自动装配，自动为属性赋值
    //@Qualifier:指定一个名作为id，，让Spring别使用变量名作为id
    @Autowired
    private BookService bookService;


    public void  doGet()
    {
        bookService.save();
    }
}

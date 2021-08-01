package test;

import Servlet.BookServlet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
//使用配置和使用注解加入到容器中巨剑的行为都是默认一样的

    private ApplicationContext ioc =new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test()
   {
       //id默认就是类名首字母小写
       Object bookdao = ioc.getBean("bookDao");
       System.out.println(bookdao);
   }
   @Test
   public void test02()
   {
       BookServlet bookservlet = ioc.getBean(BookServlet.class);
       bookservlet.doGet();
   }
}

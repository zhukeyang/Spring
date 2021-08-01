package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;
import service.UserService;

public class IOCtest {
    ApplicationContext ioc =new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test()
    {
        BookService bookService = ioc.getBean(BookService.class);
        UserService userService = ioc.getBean(UserService.class);
        bookService.save();
        userService.save();
    }


}



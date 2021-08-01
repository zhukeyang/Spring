package atguigu.test;

import atguigu.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {
    ApplicationContext ioc =new ClassPathXmlApplicationContext("tx.xml");
    @Test
    public void test()
    {
        BookService bean = ioc.getBean(BookService.class);
        bean.checkout("a","001");
    }
}

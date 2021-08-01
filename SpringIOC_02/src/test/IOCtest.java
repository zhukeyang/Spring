package test;

import atguigu.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestConstructor;

import javax.sql.DataSource;


public class IOCtest {
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext03.xml");
    @Test
    public void test()
    {
//        //按照id获取
//        DataSource dataSource = (DataSource) ioc.getBean("dataSource");
//        System.out.println(dataSource);
        //按照类型获取
//        ioc.getBean(DataSource.class);
    }
    @Test
    public void test02()
    {
        Person person04 = (Person) ioc.getBean("person04");
        System.out.println(person04);
    }
}

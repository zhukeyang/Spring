package test;

import com.atguigu.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
//
//    private ApplicationContext ioc =new ClassPathXmlApplicationContext("ioc.xml");
    /*
    * 1.src，源码包开始的路径，称为类路径的开始
    *       idea默认在out里
    * 2.先导报再创建配置文件
    * */
    /*
    * 几个细节：
    *   1.ApplicationContext(IOC容器接口)
    *   ClassPathXmlApplicationContext：配置文件的类路径
    *   FileSystemXmlApplicationContext():配置文件在磁盘路径下
    *   2.给容器注册一个组件：我们也从容器中按照id拿到了这个组价的独享？
    *       组件的创建工作是容器完成的
    *   Person是什么时候创建好的呢？
    *       容器中对象的创建，在容器创建完成的时候就创建好了，
    *       同一个组件在IOC容器中只有一份（单实例）（容器启动完成前都创建好了）
    *   3.容器中没有这个组件，获取组件，报错。。。
    *   4.IOC容器在创建这个组件对象的时候，（property）会利用setter方法为属性赋值
        5.JavaBean的属性名是由什么决定的
        *   是由getter和setter自动生成的（不要改）
    * */
//    @Test
//    public void test()
//    {
//        //代表IOC容器
//        //当前应用的XML配置文件在classpath路径
//        //根据spring的配置文件得到ioc容器对象
//        ApplicationContext ioc =new ClassPathXmlApplicationContext("ioc.xml");
//        Person person01 = (Person) ioc.getBean("person01");
//        System.out.println(person01);
//    }
    /*
    * 如果IOC容器中这个类型的bean有多个，查找就会报错
    * */

//    public void test02()
//    {
//        Person bean = ioc.getBean("person02",Person.class);
//        System.out.println(bean);
//        Person person03 = (Person) ioc.getBean("person03");
//        System.out.println(person03);
//        Person person04 = (Person) ioc.getBean("person04");
//        System.out.println(person04);
//    }


    private ApplicationContext ioc =new ClassPathXmlApplicationContext("ioc3.xml");
//    @Test
//    public void test()
//    {
//        Person person01 = (Person) ioc.getBean("person01");
//        System.out.println(person01);
//        System.out.println(person01.getCar());
//        Person person02 = (Person) ioc.getBean("person02");
//        System.out.println(person02.getBooks());
//        Person person06 = (Person) ioc.getBean("person06");
//        System.out.println(person06);
//    }
    @Test
    public void test()
    {
//        Object airPlane01 = ioc.getBean("airPlane01");
//        System.out.println(airPlane01);
//        System.out.println("容器启动完成");
//        Object airPlane02 = ioc.getBean("airPlane02");
//        System.out.println(airPlane02);
//        System.out.println("容器启动完成");
        Object factoryBean = ioc.getBean("factoryBean");
        System.out.println(factoryBean);
    }
}

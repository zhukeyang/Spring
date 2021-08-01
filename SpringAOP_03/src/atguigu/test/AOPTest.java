package atguigu.test;

import atguigu.impl.MyMath.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
    /*
    * 通知方法的执行顺序：
    * 正常执行：@Before(前置通知)==>@After(后置通知)==》@AfterReturning;
    * 异常执行：
    *
    * */

    @Test
    public void test()
    {
//        Calculator calculator=new Calculator();
//        calculator.add(2,12);
        //从IOC容器中拿
        /*
        * 细节1：AOP的底层就是动态代理，容器中保存的组件是他的代理对象，$$EnhancerBySpringCGLIB$$c34e71e9。当然不是本类的类型
        *       cglib帮我们创建好的代理对象
        *       没有接口就是转成本类类型，有接口就是转成接口类型
        * */
        Calculator bean = ioc.getBean(Calculator.class);
        bean.add(2,1);

    }
}

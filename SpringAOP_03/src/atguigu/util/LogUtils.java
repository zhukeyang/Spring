package atguigu.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//如何将这个切面类的通知方法，动态的在目标方法运行的哥哥位置切入
@Aspect
@Component
public class LogUtils {
    /*
    * 告诉Spring每个方法都是什么时候运行
    * try{
    *   method.invoke(obj,args);
    * }
    *   catch(e)
    *   {
    *
    *   }
    * 通知注解
    * @Before:在目标方法之前；                     前置通知
    * @After:在目标方法运行结束之后                 后置通知
    * @AfterReturning:在目标方法正常返回之后        返回通知
    * @AfterThrowing:在目标方法抛出异常之后运行      异常通知
    * Around:环绕                                环绕通知
    * */

    //想在执行目标方法之前执行;写切入点表达式
    // execution（方法签名）
    @Before("execution(public int  atguigu.impl.MyMath.Calculator.*(int,int))")
    public static void logStart()
    {
        System.out.println("方法开始执行，用的参数列表");
    }
    /*
    * 切入点表达式的写法
    *   固定格式：execution(访问权限符 返回值类型，方法全类名（参数列表）)
    * 通配符：
    *   *:
    *     1.匹配一个或多个字符；execution(public int  atguigu.impl.MyMath.Calculator.*(int,int))"
    *     2.匹配任意一个参数，第一个是int 第二个是任意：execution(public int  atguigu.impl.MyMath.Calculator.*(int,*))"
    *     3.*放在路径只能匹配1层路径
    *     4.权限位置*不写
    *  ..：
    *       1.匹配任意多个参数，任意类型参数：execution(public int  atguigu.impl.MyMath.Calculator.*(..))"
    *       2.匹配任意多层路径：execution(public int  atguigu..MyMath.Calculator.*(int,int))"
    *
    *记住两种：
    * 最精确：execution(public int com.atguigu..MyMath.Calculator.*(int,int))
    * 最模糊(所有)：execution(*  *.*(..)) 千万别写；
    * &&:我们要切入的位置满足这两个表达式
    * ||满足任意一个表达式即可
    * ！只要不是这个位置的都切
    *
    * 告诉Spring这个result是用来接收返回值的
    * Spring对通知方法的要求不严格
    * 唯一要求的就是方法的参数列表一定不能乱写
    *   通知方法是Spring利用反射调用的，每次方法调用得确定这个方法的参数表的值；
    *   参数表上的每一个参数，Spring都得知道是什么？
    *   JoinPoint:认识
    *   不知道的参数一定得告诉Spring是什么
    *
    *   抽取可重用的切入点表达式
    *   1.随便声明一个没有实现返回void的空方法
    *   2.给方法上标注@Pointcut注解
    * */
    //想在目标方法正常执行完成之后执行
    @AfterReturning(value = "execution(public int atguigu.impl.MyMath.Calculator.*(int,int))",returning ="result")
    public static void logReturn(JoinPoint joinPoint,Object result)
    {

        System.out.println("方法正常执行完成,计算结果是"+result);
    }
    //目标方法出现异常的时候执行
    /*
    * 细节：在通知方法运行的时候，拿到目标的详细信息；
    *   1.只需要为通知方法的参数列表上写一个参数
    *       JoinPoint joinPoint:封装了当前目标方法的详细信息
    *
    * */
    @AfterThrowing(value = "execution(public int atguigu.impl.MyMath.Calculator.*(int,int))",throwing = "e")
    public static void logException(JoinPoint joinPoint,Exception e)
    {
        //获取目标方法运行时使用的参数
        Object[] joinPointArgs = joinPoint.getArgs();
        System.out.println("方法执行出现了异常，异常信息是"+joinPointArgs);
    }
    //目标方法结束的时候执行
    @After("execution(public int atguigu.impl.MyMath.Calculator.*(int,int))")
    public static void logEnd(JoinPoint joinPoint)
    {
        Object[] args = joinPoint.getArgs();
        System.out.println("JoinPoint: "+ Arrays.asList(args));
        System.out.println("方法最终结束了");
    }
}

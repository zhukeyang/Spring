package proxy;

import com.atguigu.inter.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//生成代理对象的类
public class CalculatorProxy {

    public static class getProxy extends CalculatorProxy {
        public static Calculator getProxy(final Calculator calculator) {
            InvocationHandler h=new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("方法开始执行");
                    Object result = method.invoke(calculator, args);
                    //返回值必须返回出去，外界才能感受到
                    return result;
                }

            };
            Class<?>[] interfaces=calculator.getClass().getInterfaces();
            //loader:类加载器
            ClassLoader loader = calculator.getClass().getClassLoader();
            //Proxy为目标对象创建代理对象
            Object proxy = Proxy.newProxyInstance(loader, interfaces, h);
            return (Calculator) proxy;
        }



//        public getProxy(Calculator calculator) {
//            super();
//        }

//        public Calculator getProxy(final Calculator calculator) {
//            //目标方法执行器。帮目标对象执行目标方法
//            InvocationHandler h=new InvocationHandler() {
//                /*
//                * Object proxy:代理对象，给jdk使用，任何时候都不动
//                * Method method：当前将要执行的目标对象的方法
//                * Object[] args：这个方法调用时，外界传入的值
//                * */
//                @Override
//                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                   //利用反射执行目标方法
//                    // 目标方法执行后的返回值
//                    System.out.println("方法开始执行");
//                    Object result = method.invoke(calculator, args);
//                    //返回值必须返回出去，外界才能感受到
//                    return result;
//                }
//            };
//            Class<?>[] interfaces=calculator.getClass().getInterfaces();
//            //loader:类加载器
//            ClassLoader loader = calculator.getClass().getClassLoader();
//            //Proxy为目标对象创建代理对象
//            Object proxy = Proxy.newProxyInstance(loader, interfaces, h);
//            return (Calculator) proxy;
        }
    }



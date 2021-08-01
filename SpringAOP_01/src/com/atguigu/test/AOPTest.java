package com.atguigu.test;

import com.atguigu.inter.Calculator;
import org.junit.Test;
import proxy.CalculatorProxy;

public class AOPTest {
    @Test
    public void test()
    {
        Calculator calculator = new com.atguigu.impl.MyMath.Calculator();
        CalculatorProxy proxy=new CalculatorProxy.getProxy();

    }
}

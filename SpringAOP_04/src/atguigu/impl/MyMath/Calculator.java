package atguigu.impl.MyMath;

import atguigu.inter.CalculatorInter;

public class Calculator implements CalculatorInter {

    public int add(int i, int j) {
        System.out.println("add方法开始"+i+j);
        int result=i+j;
        System.out.println("运行完成"+result);
        return result;
    }


    public int sub(int i, int j) {
        System.out.println("sub方法开始"+i+j);
        int result=i-j;
        return result;
    }


    public int mul(int i, int j) {
        System.out.println("mul方法开始"+i+j);
        int result=i*j;
        return result;
    }


    public int div(int i, int j) {
        System.out.println("div方法开始"+i+j);
        int result=i/j;
        return result;
    }
}

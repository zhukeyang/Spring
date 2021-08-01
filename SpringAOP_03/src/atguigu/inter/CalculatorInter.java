package atguigu.inter;

/*
* 接口不加载容器中；
* 实际上可以加，加了也不创建对象，只要一个组件是一个接口
* 相当于告诉Spring，IOC容器中可能有这种类型的组件
*
* */
public interface CalculatorInter {
    int add(int i, int j);

    int sub(int i, int j);

    int mul(int i, int j);

    int div(int i, int j);
}

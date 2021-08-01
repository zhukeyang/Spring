package factory;

import com.atguigu.Book;
import org.springframework.beans.factory.FactoryBean;

import java.util.UUID;

public class MyFactoryBean implements FactoryBean<Book> {
//  返回创建的对象  getObject：工厂方法
//先编写一个FactoryBean的实现类
//    在Spring中进行注册
//    IOC启动的时候，不会创建实例（多实例）
//    FactoryBean：获取的时候才创建对象
    @Override
    public Book getObject() throws Exception {
        Book book=new Book();
        book.setBookname(UUID.randomUUID().toString());
        System.out.println("容器创建");
        return book;
    }
    //返回创建的对象类型
//    Spring会自动调用这个方法来确认创建的对象是什么类型
    @Override
    public Class<?> getObjectType() {
        return Book.class;
    }
    /*
    * 判断是否为单例
    * false:不是
    * true:是
    * */
    @Override
    public boolean isSingleton() {
        return false;
    }
}

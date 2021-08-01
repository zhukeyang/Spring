package atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MulService {
    @Autowired
    private BookService bookService;
    @Transactional
    public void mulTx()
    {
        //回滚与否都是可以设置的
        //传播行为来设置这个事务方法是不是和之前的大事务共享一个事务（使用同一条连接）
        bookService.checkout("a","001");
        bookService.updatePrice("002",998);
        int i =10/0;
    }
}

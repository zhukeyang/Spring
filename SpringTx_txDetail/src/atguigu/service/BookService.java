package atguigu.service;

import atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class BookService {
@Autowired
    BookDao bookDao;
@Transactional
    public void checkout(String username,String isbn)
    {
        bookDao.updateStock(isbn);
        int price = bookDao.getPrice(isbn);
        bookDao.updateBalance(username,price);
    }
    @Transactional
    public void updatePrice(String isbn,int price)
    {
        bookDao.updatePrice(isbn,price);
    }
}

package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
//@Scope(value = "prototype")
public class BookDao {
    @Autowired
    public void saveBook()
    {

    }
}

package service;

import dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService<T> {
    @Autowired
    BaseDao<T> baseDao;
    public void save()
    {
        baseDao.save();
    }
}

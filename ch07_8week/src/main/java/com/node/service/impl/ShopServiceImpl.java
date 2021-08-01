package com.node.service.impl;

import com.node.dao.ShopDao;
import com.node.domain.Shops;
import com.node.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;
    @Override
    public int addShop(Shops shops) {
        int rows = shopDao.insertShop(shops);
        return rows;
    }

    @Override
    public List<Shops> queryShops() {
        List<Shops> list = shopDao.selectShops();
        return list;
    }
}

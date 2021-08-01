package com.node.service.impl;

import com.node.dao.GoodsDao;
import com.node.domain.Goods;
import com.node.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public int addGoods(Goods goods) {
        int rows=goodsDao.insertGoods(goods);
        return rows;
    }

    @Override
    public List<Goods> queryGoods() {
        List<Goods> list=goodsDao.selectGoods();
        return list;
    }
}

package com.node.service;

import com.node.domain.Goods;
import com.node.domain.Shops;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface GoodsService {
    int addGoods(Goods goods);
    List<Goods> queryGoods();
}

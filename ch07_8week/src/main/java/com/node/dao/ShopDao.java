package com.node.dao;

import com.node.domain.Goods;
import com.node.domain.Shops;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ShopDao {
    int insertShop(Shops shops);
    List<Shops> selectShops();
}

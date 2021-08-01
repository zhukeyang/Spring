package com.node.dao;

import com.node.domain.Goods;
import com.node.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface GoodsDao {
    int insertGoods(Goods goods);
    List<Goods> selectGoods();
}

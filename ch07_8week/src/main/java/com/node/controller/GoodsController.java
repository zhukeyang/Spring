package com.node.controller;

import com.node.domain.Goods;
import com.node.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class GoodsController {

    @Qualifier("goodsServiceImpl")
    @Autowired
    private GoodsService service;
    @RequestMapping("/addGoods.do")
    public ModelAndView insertGoods(Goods goods)
    {
        ModelAndView mv=new ModelAndView();
        int rows =service.addGoods(goods);
        mv.addObject("msg",goods.getName());
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("queryGoods.do")
    @ResponseBody
    public List<Goods> queryGoods()
    {
        List<Goods> goods=service.queryGoods();
        return goods;
    }
}

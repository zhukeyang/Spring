package com.node.controller;

import com.node.domain.Shops;
import com.node.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ShopController {
    @Qualifier("shopServiceImpl")
    @Autowired
    private ShopService service;
    @RequestMapping("/addShop")
    public ModelAndView insertShop(Shops shops)
    {
        ModelAndView mv=new ModelAndView();
        int rows = service.addShop(shops);
        mv.addObject("msg",shops.getName());
        mv.setViewName("result");
        return mv;
    }
    @ResponseBody
    @RequestMapping("/queryShop.do")
    public List<Shops> queryShop()
    {
        List<Shops> shops=service.queryShops();
        return shops;
    }
}

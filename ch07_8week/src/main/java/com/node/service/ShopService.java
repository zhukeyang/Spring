package com.node.service;

import com.node.domain.Shops;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface ShopService {
    int addShop(Shops shops);
    List<Shops> queryShops();
}

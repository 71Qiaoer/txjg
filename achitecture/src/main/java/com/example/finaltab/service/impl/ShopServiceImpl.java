package com.example.finaltab.service.impl;

import com.example.finaltab.dao.ShopDAO;
import com.example.finaltab.dto.ShopDTO;
import com.example.finaltab.entity.Shop;
import com.example.finaltab.service.ShopService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    private final ShopDAO shopDAO;

    public ShopServiceImpl(ShopDAO shopDAO) {
        this.shopDAO = shopDAO;
    }

    @Override
    public ShopDTO createShop(ShopDTO shopDTO) {
        Shop shop = new Shop();
        BeanUtils.copyProperties(shopDTO, shop);
        Shop savedShop = shopDAO.save(shop);
        ShopDTO resultDTO = new ShopDTO();
        BeanUtils.copyProperties(savedShop, resultDTO);
        return resultDTO;
    }

    @Override
    public List<ShopDTO> getAllShops() {
        return null;
    }

}

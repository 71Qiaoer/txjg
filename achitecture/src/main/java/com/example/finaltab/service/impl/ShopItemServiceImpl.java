package com.example.finaltab.service.impl;

import com.example.finaltab.dao.ShopItemDAO;
import com.example.finaltab.dto.ShopItemDTO;
import com.example.finaltab.entity.ShopItem;
import com.example.finaltab.service.ShopItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopItemServiceImpl implements ShopItemService {

    private final ShopItemDAO shopItemDAO;

    public ShopItemServiceImpl(ShopItemDAO shopItemDAO) {
        this.shopItemDAO = shopItemDAO;
    }

    @Override
    public ShopItemDTO createShopItem(ShopItemDTO shopItemDTO) {
        ShopItem shopItem = new ShopItem();
        BeanUtils.copyProperties(shopItemDTO, shopItem);
        ShopItem savedShopItem = shopItemDAO.save(shopItem);
        ShopItemDTO resultDTO = new ShopItemDTO();
        BeanUtils.copyProperties(savedShopItem, resultDTO);
        return resultDTO;
    }

    @Override
    public List<ShopItemDTO> getAllShopItems() {
        return null;
    }

}

package com.example.finaltab.service;

import com.example.finaltab.dto.ShopItemDTO;
import java.util.List;

public interface ShopItemService {
    ShopItemDTO createShopItem(ShopItemDTO shopItemDTO);

    List<ShopItemDTO> getAllShopItems();
}

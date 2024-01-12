package com.example.finaltab.service;

import com.example.finaltab.dto.ShopDTO;
import java.util.List;

public interface ShopService {
    ShopDTO createShop(ShopDTO shopDTO);

    List<ShopDTO> getAllShops();
}

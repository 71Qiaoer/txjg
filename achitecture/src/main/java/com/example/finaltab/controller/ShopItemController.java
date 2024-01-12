package com.example.finaltab.controller;

import com.example.finaltab.dto.ShopItemDTO;
import com.example.finaltab.service.ShopItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/shopItems")
public class ShopItemController {

    @Autowired
    private ShopItemService shopItemService;

    @GetMapping
    public ResponseEntity<List<ShopItemDTO>> getAllShopItems() {
        List<ShopItemDTO> shopItems = shopItemService.getAllShopItems();
        return ResponseEntity.ok(shopItems);
    }

}

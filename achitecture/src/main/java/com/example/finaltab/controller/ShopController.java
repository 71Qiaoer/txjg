package com.example.finaltab.controller;

import com.example.finaltab.dto.ShopDTO;
import com.example.finaltab.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping
    public ResponseEntity<List<ShopDTO>> getAllShops() {
        List<ShopDTO> shops = shopService.getAllShops();
        return ResponseEntity.ok(shops);
    }

}

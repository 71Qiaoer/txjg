package com.example.finaltab.controller;

import com.example.finaltab.dto.BusinessDTO;
import com.example.finaltab.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/businesses")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @GetMapping
    public ResponseEntity<List<BusinessDTO>> getAllBusinesses() {
        List<BusinessDTO> businesses = businessService.getAllBusinesses();
        return ResponseEntity.ok(businesses);
    }

}

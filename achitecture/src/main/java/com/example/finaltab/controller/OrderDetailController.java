package com.example.finaltab.controller;

import com.example.finaltab.dto.OrderDetailDTO;
import com.example.finaltab.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/orderDetails")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @GetMapping
    public ResponseEntity<List<OrderDetailDTO>> getAllOrderDetails() {
        List<OrderDetailDTO> orderDetails = orderDetailService.getAllOrderDetails();
        return ResponseEntity.ok(orderDetails);
    }

}

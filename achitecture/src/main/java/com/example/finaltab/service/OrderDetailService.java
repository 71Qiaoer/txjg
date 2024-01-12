package com.example.finaltab.service;

import com.example.finaltab.dto.OrderDetailDTO;
import java.util.List;

public interface OrderDetailService {
    OrderDetailDTO createOrderDetail(OrderDetailDTO orderDetailDTO);

    List<OrderDetailDTO> getAllOrderDetails();
}

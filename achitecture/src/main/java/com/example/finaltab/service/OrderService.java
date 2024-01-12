package com.example.finaltab.service;

import com.example.finaltab.dto.OrderDTO;
import java.util.List;

public interface OrderService {
    OrderDTO createOrder(OrderDTO orderDTO);

    List<OrderDTO> getAllOrders();
}

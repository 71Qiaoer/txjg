package com.example.finaltab.service.impl;

import com.example.finaltab.dao.OrderDAO;
import com.example.finaltab.dto.OrderDTO;
import com.example.finaltab.entity.Order;
import com.example.finaltab.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderDAO orderDAO;

    public OrderServiceImpl(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = new Order();
        BeanUtils.copyProperties(orderDTO, order);
        Order savedOrder = orderDAO.save(order);
        OrderDTO resultDTO = new OrderDTO();
        BeanUtils.copyProperties(savedOrder, resultDTO);
        return resultDTO;
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return null;
    }

}

package com.example.finaltab.service.impl;

import com.example.finaltab.dao.OrderDetailDAO;
import com.example.finaltab.dto.OrderDetailDTO;
import com.example.finaltab.entity.OrderDetail;
import com.example.finaltab.service.OrderDetailService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    private final OrderDetailDAO orderDetailDAO;

    public OrderDetailServiceImpl(OrderDetailDAO orderDetailDAO) {
        this.orderDetailDAO = orderDetailDAO;
    }

    @Override
    public OrderDetailDTO createOrderDetail(OrderDetailDTO orderDetailDTO) {
        OrderDetail orderDetail = new OrderDetail();
        BeanUtils.copyProperties(orderDetailDTO, orderDetail);
        OrderDetail savedOrderDetail = orderDetailDAO.save(orderDetail);
        OrderDetailDTO resultDTO = new OrderDetailDTO();
        BeanUtils.copyProperties(savedOrderDetail, resultDTO);
        return resultDTO;
    }

    @Override
    public List<OrderDetailDTO> getAllOrderDetails() {
        return null;
    }

}

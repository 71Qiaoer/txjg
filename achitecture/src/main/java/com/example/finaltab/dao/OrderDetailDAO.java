package com.example.finaltab.dao;

import com.example.finaltab.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long> {

}


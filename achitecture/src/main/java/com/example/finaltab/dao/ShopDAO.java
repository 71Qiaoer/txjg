package com.example.finaltab.dao;

import com.example.finaltab.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopDAO extends JpaRepository<Shop, Long> {

}


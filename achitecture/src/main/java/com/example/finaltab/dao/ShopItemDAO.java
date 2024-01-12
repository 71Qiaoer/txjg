package com.example.finaltab.dao;

import com.example.finaltab.entity.ShopItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopItemDAO extends JpaRepository<ShopItem, Long> {

}


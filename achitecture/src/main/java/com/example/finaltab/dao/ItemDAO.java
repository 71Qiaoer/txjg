package com.example.finaltab.dao;

import com.example.finaltab.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDAO extends JpaRepository<Item, Long> {

}


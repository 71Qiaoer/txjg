package com.example.finaltab.dao;

import com.example.finaltab.entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessDAO extends JpaRepository<Business, Long> {

}


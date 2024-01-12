package com.example.finaltab.service;

import com.example.finaltab.dto.BusinessDTO;
import java.util.List;

public interface BusinessService {
    BusinessDTO createBusiness(BusinessDTO businessDTO);

    List<BusinessDTO> getAllBusinesses();
}


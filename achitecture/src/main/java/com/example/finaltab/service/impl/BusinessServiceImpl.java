package com.example.finaltab.service.impl;

import com.example.finaltab.dao.BusinessDAO;
import com.example.finaltab.dto.BusinessDTO;
import com.example.finaltab.entity.Business;
import com.example.finaltab.service.BusinessService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {

    private final BusinessDAO businessDAO;

    public BusinessServiceImpl(BusinessDAO businessDAO) {
        this.businessDAO = businessDAO;
    }

    @Override
    public BusinessDTO createBusiness(BusinessDTO businessDTO) {
        Business business = new Business();
        BeanUtils.copyProperties(businessDTO, business);
        Business savedBusiness = businessDAO.save(business);
        BusinessDTO resultDTO = new BusinessDTO();
        BeanUtils.copyProperties(savedBusiness, resultDTO);
        return resultDTO;
    }

    @Override
    public List<BusinessDTO> getAllBusinesses() {
        return null;
    }

}

package com.example.finaltab.service.impl;

import com.example.finaltab.dao.CustomerDAO;
import com.example.finaltab.dto.CustomerDTO;
import com.example.finaltab.entity.Customer;
import com.example.finaltab.service.CustomerService;
import org.hibernate.mapping.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer);
        Customer savedCustomer = customerDAO.save(customer);
        CustomerDTO resultDTO = new CustomerDTO();
        BeanUtils.copyProperties(savedCustomer, resultDTO);
        return resultDTO;
    }

    @Override
    public List getAllCustomers() {
        return null;
    }

}

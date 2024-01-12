package com.example.finaltab.service;

import com.example.finaltab.dto.CustomerDTO;
import org.hibernate.mapping.List;

public interface CustomerService {
    CustomerDTO createCustomer(CustomerDTO customerDTO);

    List getAllCustomers();
}

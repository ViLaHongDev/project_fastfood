package com.example.fastfood_be.service;

import com.example.fastfood_be.dto.request.customer.CreateCustomerDto;
import com.example.fastfood_be.dto.response.CustomerResponse;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService {
    CustomerResponse createCustomer(CreateCustomerDto createCustomerDto);
}

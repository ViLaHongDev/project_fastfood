package com.example.fastfood_be.service;

import com.example.fastfood_be.dto.request.customer.RegisterCustomerDto;
import com.example.fastfood_be.dto.response.customer.CustomerResponse;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    CustomerResponse createUser(RegisterCustomerDto registerCustomerDto);
}

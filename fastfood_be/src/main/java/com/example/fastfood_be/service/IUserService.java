package com.example.fastfood_be.service;

import com.example.fastfood_be.dto.request.customer.CreateCustomerDto;
import com.example.fastfood_be.dto.request.user.CreateUserDto;
import com.example.fastfood_be.dto.response.UserResponse;
import com.example.fastfood_be.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    User createUserFromCustomerDto(CreateCustomerDto createCustomerDto);
    UserResponse createUser(CreateUserDto createUserDto);
}

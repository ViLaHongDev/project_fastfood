package com.example.fastfood_be.service;

import com.example.fastfood_be.dto.request.customer.RegisterCustomerDto;
import com.example.fastfood_be.dto.response.customer.CustomerResponse;
import com.example.fastfood_be.entity.Customer;
import com.example.fastfood_be.mapper.CustomerMapper;
import com.example.fastfood_be.repository.CustomerRepository;
import com.example.fastfood_be.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService{

    private final UserRepository userRepository;
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    @Override
    public CustomerResponse createUser(RegisterCustomerDto registerCustomerDto) {
        Customer customer = customerMapper.toCustomer(registerCustomerDto);

        customer = customerRepository.save(customer);

        // sẽ thêm mới user
        // email
        // password;


        return null;
    }
}

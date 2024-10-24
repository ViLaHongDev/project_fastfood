package com.example.fastfood_be.service.impl;

import com.example.fastfood_be.dto.request.customer.CreateCustomerDto;
import com.example.fastfood_be.dto.response.CustomerResponse;
import com.example.fastfood_be.entity.Customer;
import com.example.fastfood_be.entity.User;
import com.example.fastfood_be.mapper.CustomerMapper;
import com.example.fastfood_be.repository.CustomerRepository;
import com.example.fastfood_be.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements ICustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    private final UserServiceImpl userService;
    @Override
    public CustomerResponse createCustomer(CreateCustomerDto createCustomerDto) {

        User user = userService.createUserFromCustomerDto(createCustomerDto);

        Customer customer = customerMapper.toEntity(createCustomerDto);
        customer.setUser(user);

        customer = customerRepository.save(customer);

        return customerMapper.toResponse(customer);
    }
}

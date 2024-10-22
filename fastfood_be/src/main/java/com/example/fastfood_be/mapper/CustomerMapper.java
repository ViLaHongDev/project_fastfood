package com.example.fastfood_be.mapper;

import com.example.fastfood_be.dto.request.customer.RegisterCustomerDto;
import com.example.fastfood_be.dto.response.customer.CustomerResponse;
import com.example.fastfood_be.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer toCustomer(RegisterCustomerDto registerCustomerDto);
    CustomerResponse toCustomerResponse(Customer customer);
}

package com.example.fastfood_be.mapper;

import com.example.fastfood_be.dto.request.customer.CreateCustomerDto;
import com.example.fastfood_be.dto.response.CustomerResponse;
import com.example.fastfood_be.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer toEntity(CreateCustomerDto createCustomerDto);

    @Mapping(target = "id", source = "customer.id",
            defaultExpression = "java(java.util.UUID.randomUUID().toString())")
    CustomerResponse toResponse(Customer customer);
}

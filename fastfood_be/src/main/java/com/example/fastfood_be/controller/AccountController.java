package com.example.fastfood_be.controller;

import com.example.fastfood_be.dto.ApiResponse;
import com.example.fastfood_be.dto.request.customer.CreateCustomerDto;
import com.example.fastfood_be.dto.response.CustomerResponse;
import com.example.fastfood_be.service.impl.CustomerServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {
    private final CustomerServiceImpl customerService;
    @PostMapping("/register")
    public ApiResponse<CustomerResponse> register(@RequestBody @Valid CreateCustomerDto createCustomerDto){
        return ApiResponse.<CustomerResponse>builder()
                        .data(customerService.createCustomer(createCustomerDto))
                        .message("Đăng kí thành công.")
                        .build();
    }
}

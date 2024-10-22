package com.example.fastfood_be.dto.request.customer;

import lombok.Data;

@Data
public class RegisterCustomerDto {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
}

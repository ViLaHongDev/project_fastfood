package com.example.fastfood_be.dto.response.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
}

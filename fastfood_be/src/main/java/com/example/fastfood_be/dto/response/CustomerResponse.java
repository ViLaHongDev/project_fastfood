package com.example.fastfood_be.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerResponse {
    private String id;           // Trường id để nhận diện khách hàng
    private String firstName;    // Họ của khách hàng
    private String lastName;     // Tên của khách hàng
    private String phoneNumber;   // Số điện thoại của khách hàng
    private LocalDate birthDay;  // Ngày sinh của khách hàng
    private int point;           // Điểm của khách hàng

    // Nếu cần bao gồm thông tin từ đối tượng User
    // private UserResponse user;  // DTO cho User nếu cần thiết
}


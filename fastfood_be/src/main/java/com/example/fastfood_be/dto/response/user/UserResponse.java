package com.example.fastfood_be.dto.response.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String email;
    private String password;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}

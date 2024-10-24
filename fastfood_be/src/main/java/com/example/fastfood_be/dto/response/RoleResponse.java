package com.example.fastfood_be.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleResponse {
    private String id;    // ID vai trò
    private String name;  // Tên vai trò
}


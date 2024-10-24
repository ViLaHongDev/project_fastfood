package com.example.fastfood_be.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String id;                  // ID người dùng
    private String email;               // Địa chỉ email
    private LocalDateTime createAt;     // Thời gian tạo
    private LocalDateTime updateAt;     // Thời gian cập nhật
    private Set<RoleResponse> roles;     // Thông tin vai trò, nếu cần

    // Bạn có thể tạo thêm RoleResponse DTO nếu cần chi tiết về vai trò
}

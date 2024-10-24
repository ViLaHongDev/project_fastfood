package com.example.fastfood_be.dto.request.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerDto {
    @NotBlank(message = "Xin nhập họ.")
    private String firstName;

    @NotBlank(message = "Xin nhập tên.")
    private String lastName;

    @NotBlank(message = "Xin nhập số điện thoại hợp lệ.")
    @Pattern(regexp = "^[0-9]{10,15}$", message = "Số điện thoại không hợp lệ.")
    private String phoneNumber;

    @NotBlank(message = "Hãy điền địa chỉ email của bạn.")
    @Email(message = "Email không hợp lệ.")
    private String email;

    @NotBlank(message = "Vui lòng nhập mật khẩu của bạn.")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$",
            message = "Mật khẩu phải có ít nhất 8 ký tự, 1 chữ hoa, 1 số và 1 ký tự đặc biệt.")
    private String password;
}

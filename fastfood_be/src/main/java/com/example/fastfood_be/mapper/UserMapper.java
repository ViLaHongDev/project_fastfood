package com.example.fastfood_be.mapper;

import com.example.fastfood_be.dto.request.user.RegisterUserDto;
import com.example.fastfood_be.dto.response.user.UserResponse;
import com.example.fastfood_be.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(RegisterUserDto registerUserDto);
    UserResponse toUserResponse(User user);
}

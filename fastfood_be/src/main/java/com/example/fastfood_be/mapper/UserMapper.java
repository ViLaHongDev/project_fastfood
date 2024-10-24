package com.example.fastfood_be.mapper;

import com.example.fastfood_be.dto.request.user.CreateUserDto;
import com.example.fastfood_be.dto.response.UserResponse;
import com.example.fastfood_be.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(CreateUserDto createUserDto);
    @Mapping(target = "id", source = "user.id",
            defaultExpression = "java(java.util.UUID.randomUUID().toString())")
    UserResponse toResponse(User user);
}

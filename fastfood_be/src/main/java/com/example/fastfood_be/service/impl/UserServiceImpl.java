package com.example.fastfood_be.service.impl;

import com.example.fastfood_be.constant.PredefinedRole;
import com.example.fastfood_be.dto.request.customer.CreateCustomerDto;
import com.example.fastfood_be.dto.request.user.CreateUserDto;
import com.example.fastfood_be.dto.response.UserResponse;
import com.example.fastfood_be.entity.Role;
import com.example.fastfood_be.entity.User;
import com.example.fastfood_be.exception.ApplicationRuntimeException;
import com.example.fastfood_be.exception.ErrorCode;
import com.example.fastfood_be.mapper.UserMapper;
import com.example.fastfood_be.repository.RoleRepository;
import com.example.fastfood_be.repository.UserRepository;
import com.example.fastfood_be.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final RoleRepository roleRepository;
    @Override
    public User createUserFromCustomerDto(CreateCustomerDto createCustomerDto) {
        User user = new User();

        user.setEmail(createCustomerDto.getEmail());
        user.setPassword(createCustomerDto.getPassword());

        HashSet<Role> roles = new HashSet<>();
        roleRepository.findByName(PredefinedRole.USER).ifPresent(roles::add);

        user.setRole(roles);

        try {
            user = userRepository.save(user);
        }catch (DataIntegrityViolationException exception){
            throw new ApplicationRuntimeException(ErrorCode.USER_EXISTED);
        }

       return user;
    }

    @Override
    public UserResponse createUser(CreateUserDto createUserDto) {
        User user = userMapper.toEntity(createUserDto);

        HashSet<Role> roles = new HashSet<>();
        roleRepository.findByName(PredefinedRole.USER).ifPresent(roles::add);
        user.setRole(roles);

        try {
            user = userRepository.save(user);
        }catch (DataIntegrityViolationException exception){
            throw new ApplicationRuntimeException(ErrorCode.USER_EXISTED);
        }

        return userMapper.toResponse(user);
    }
}

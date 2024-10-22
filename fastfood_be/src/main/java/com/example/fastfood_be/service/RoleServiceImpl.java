//package com.example.fastfood_be.service;
//
//import com.example.fastfood_be.dto.request.role.CreateRoleDto;
//import com.example.fastfood_be.dto.response.role.RoleResponse;
//import com.example.fastfood_be.entity.Role;
//import com.example.fastfood_be.mapper.RoleMapper;
//import com.example.fastfood_be.repository.RoleRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class RoleServiceImpl implements IRoleService{
//
//    private final RoleMapper roleMapper;
//    private final RoleRepository roleRepository;
//    @Override
//    public RoleResponse createNew(CreateRoleDto createRoleDto) {
//        Role role = roleMapper.toRole(createRoleDto);
//        try {
//            role = roleRepository.save(role);
//        }catch (Exception exception){
//
//        }
//        return roleMapper.toRoleResponse(role);
//    }
//}

//package com.example.fastfood_be.controller;
//
//import com.example.fastfood_be.dto.request.role.CreateRoleDto;
//import com.example.fastfood_be.dto.response.ApiResponse;
//import com.example.fastfood_be.dto.response.role.RoleResponse;
//import com.example.fastfood_be.service.RoleServiceImpl;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/role")
//@RequiredArgsConstructor
//public class RoleController {
//
//    private final RoleServiceImpl roleService;
//
//    @PostMapping
//    public ApiResponse<RoleResponse> createNew(@RequestBody CreateRoleDto createRoleDto){
//        return ApiResponse.<RoleResponse>builder()
//                .data(roleService.createNew(createRoleDto))
//                .build();
//    }
//}

package com.example.fastfood_be.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private LocalDate birthDay;
    private int point;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
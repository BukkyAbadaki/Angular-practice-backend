package com.example.angularpracticebackend.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDto {
    private String email;
    private String password;
}

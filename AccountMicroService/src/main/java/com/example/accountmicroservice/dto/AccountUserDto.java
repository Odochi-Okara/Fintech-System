package com.example.accountmicroservice.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountUserDto {

    private String name;

    private String emailss; //check;

    private String password;

    private String username;

    private String phone;

    private Boolean isEnabled;
}

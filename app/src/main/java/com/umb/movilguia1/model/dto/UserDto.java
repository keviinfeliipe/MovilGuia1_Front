package com.umb.movilguia1.model.dto;

public class UserDto {

    private String fullName;
    private String email;
    private String password;

    public UserDto(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }
}

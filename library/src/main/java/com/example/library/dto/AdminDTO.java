package com.example.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data @NoArgsConstructor @AllArgsConstructor
public class AdminDTO {
    @Size(min = 3, max = 10, message = "Invalid First Name (3 - 10 characters)")
    private String firstName;
    @Size(min = 3, max = 10, message = "Invalid Second Name (3 - 10 characters)")
    private String secondName;
    private String userName;
    @Size(min = 5, max = 15, message = "Invalid Password (5 - 15 characters)")
    private String userPassword;
    private String repeatuserPassword;
}

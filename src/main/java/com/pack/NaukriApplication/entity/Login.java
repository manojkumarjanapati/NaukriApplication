package com.pack.NaukriApplication.entity;


import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Embeddable
public class Login {
    @Email(message = "invalid Email")
    private String email;
    @NotEmpty(message = "Password cannot be empty")
    private String password;

}

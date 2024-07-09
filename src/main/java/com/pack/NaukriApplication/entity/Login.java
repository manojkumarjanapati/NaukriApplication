package com.pack.NaukriApplication.entity;


import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class Login {
    @Email(message = "invalid Email")
    private String email;
    @NotEmpty(message = "Password cannot be empty")
    private String password;

}

package com.northerntrust.registration;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserRegistrationRequest {
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Password is mandatory")
    private String password;

    // getters and setters
}

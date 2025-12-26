package com.northerntrust.registration;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Otp {
    @Id
    private String id;
    private String email;
    private String otp;

    // Constructors, getters, and setters
}

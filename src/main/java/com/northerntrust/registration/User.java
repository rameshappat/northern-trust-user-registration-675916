package com.northerntrust.registration;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
    private String id;
    private String email;
    private String password;

    // Constructors, getters, and setters
}

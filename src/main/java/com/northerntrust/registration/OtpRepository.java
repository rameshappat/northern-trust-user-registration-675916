package com.northerntrust.registration;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OtpRepository extends MongoRepository<Otp, String> {
    Otp findByEmail(String email);
}

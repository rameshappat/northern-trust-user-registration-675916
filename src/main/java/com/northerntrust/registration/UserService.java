package com.northerntrust.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OtpService otpService;

    public void registerUser(UserRegistrationRequest request) throws Exception {
        // Validate request and save user
        User user = new User(request.getEmail(), request.getPassword());
        userRepository.save(user);

        // Send OTP
        otpService.sendOtp(user);
    }
}

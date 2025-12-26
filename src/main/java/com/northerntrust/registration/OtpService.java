package com.northerntrust.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtpService {

    @Autowired
    private OtpRepository otpRepository;
    @Autowired
    private NotificationService notificationService;

    public void sendOtp(User user) {
        String otp = generateOtp();
        // Save OTP in DB
        otpRepository.save(new Otp(user.getEmail(), otp));

        // Send OTP via Email and SMS
        notificationService.sendEmail(user.getEmail(), otp);
        notificationService.sendSms(user.getPhoneNumber(), otp);
    }

    private String generateOtp() {
        // Generate a random OTP
        return String.valueOf((int) (Math.random() * 9000) + 1000);
    }
}

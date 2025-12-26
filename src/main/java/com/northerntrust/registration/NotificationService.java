package com.northerntrust.registration;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendEmail(String email, String otp) {
        // Implement SendGrid integration for email
    }

    public void sendSms(String phoneNumber, String otp) {
        // Implement Twilio integration for SMS
    }
}

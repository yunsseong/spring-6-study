package com.spring_6_study.__dependency_injection_method_comparison.di;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void sendNotification(String message) {
        System.out.println("알림 발송 : " + message);
    }
}

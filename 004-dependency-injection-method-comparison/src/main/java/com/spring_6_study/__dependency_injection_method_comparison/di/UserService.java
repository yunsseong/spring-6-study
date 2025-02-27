package com.spring_6_study.__dependency_injection_method_comparison.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationService notificationService;

    @Autowired
    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }
    public User findUser(Long userId) {
        User foundUser = userRepository.findUserById(userId)
                .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));
        notificationService.sendNotification("찾은 사용자 - " + foundUser.getName());
        return foundUser;
    }
    public User registerUser(Long userId, String name) {
        User registerdUser = userRepository.save(new User(userId, name));
        notificationService.sendNotification("새 사용자 - " + registerdUser.getName());
        return registerdUser;
    }
}

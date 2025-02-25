package com.spring6_study.section02_concept_and_implementation_of_di.di.example.spring.setter_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private UserRepository userRepository;

    @Autowired
    private void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void search() {
        userRepository.getUser();
    }
}

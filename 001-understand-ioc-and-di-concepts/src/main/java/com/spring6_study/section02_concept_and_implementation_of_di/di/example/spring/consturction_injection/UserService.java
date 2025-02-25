package com.spring6_study.section02_concept_and_implementation_of_di.di.example.spring.consturction_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void search() {
        userRepository.getUser();
    }
}

package com.spring6_study.section02_concept_and_implementation_of_di.di.example.java.consturction_injection;

public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void search() {
        userRepository.getUser();
    }
}

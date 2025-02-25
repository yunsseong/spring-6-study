package com.spring6_study.section02_concept_and_implementation_of_di.di.example.java.setter_injection;

public class UserService {

    private UserRepository userRepository;

    public void setUserRepository(
            UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void search() {
        userRepository.getUser();
    }
}

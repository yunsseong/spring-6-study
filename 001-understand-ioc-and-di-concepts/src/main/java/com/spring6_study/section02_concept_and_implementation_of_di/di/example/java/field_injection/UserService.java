package com.spring6_study.section02_concept_and_implementation_of_di.di.example.java.field_injection;

public class UserService {

    public UserRepository userRepository;

    public void search() {
        userRepository.getUser();
    }
}

package com.spring6_study.section02_concept_and_implementation_of_di.di.example.java.consturction_injection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        userService.search();
    }
}

package com.spring6_study.section02_concept_and_implementation_of_di.di.example.java.setter_injection;
public class Application {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService();
        userService.setUserRepository(userRepository);
        userService.search();
    }
}

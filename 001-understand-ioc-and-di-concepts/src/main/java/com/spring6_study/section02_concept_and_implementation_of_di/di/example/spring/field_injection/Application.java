package com.spring6_study.section02_concept_and_implementation_of_di.di.example.spring.field_injection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserService userService = context.getBean(
                UserService.class);
        userService.search();
    }
}

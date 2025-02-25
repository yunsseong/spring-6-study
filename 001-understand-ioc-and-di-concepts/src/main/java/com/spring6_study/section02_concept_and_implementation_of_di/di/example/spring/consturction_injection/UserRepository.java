package com.spring6_study.section02_concept_and_implementation_of_di.di.example.spring.consturction_injection;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    public void getUser() {
        System.out.println("유저를 조회합니다.");
    }
}

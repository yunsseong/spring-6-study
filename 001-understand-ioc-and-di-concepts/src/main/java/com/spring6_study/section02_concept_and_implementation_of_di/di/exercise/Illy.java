package com.spring6_study.section02_concept_and_implementation_of_di.di.exercise;

public class Illy implements CoffeeCapsule{
    private String name = "일리";
    @Override
    public String extract() {
        return name;
    }
}

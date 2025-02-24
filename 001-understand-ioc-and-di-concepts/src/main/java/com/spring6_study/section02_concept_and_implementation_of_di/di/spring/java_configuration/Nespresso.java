package com.spring6_study.section02_concept_and_implementation_of_di.di.spring.java_configuration;

import com.spring6_study.section02_concept_and_implementation_of_di.di.exercise.CoffeeCapsule;

public class Nespresso implements CoffeeCapsule {
    private String name = "네스프레소";
    @Override
    public String extract() {
        return name;
    }
}

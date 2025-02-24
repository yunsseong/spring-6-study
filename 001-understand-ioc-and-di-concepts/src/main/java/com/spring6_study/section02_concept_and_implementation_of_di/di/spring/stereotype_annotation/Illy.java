package com.spring6_study.section02_concept_and_implementation_of_di.di.spring.stereotype_annotation;

import com.spring6_study.section02_concept_and_implementation_of_di.di.exercise.CoffeeCapsule;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Illy implements CoffeeCapsule {
    private String name = "일리";

    @Override
    public String extract() {
        return name;
    }
}

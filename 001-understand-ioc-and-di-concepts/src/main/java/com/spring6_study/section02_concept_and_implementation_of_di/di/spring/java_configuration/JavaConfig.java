package com.spring6_study.section02_concept_and_implementation_of_di.di.spring.java_configuration;

import com.spring6_study.section02_concept_and_implementation_of_di.di.exercise.CoffeeCapsule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfig {

    @Bean
    public CoffeeMachine coffeeMachine(CoffeeCapsule coffeeCapsule) {
        return new CoffeeMachine(coffeeCapsule);
    }

    @Bean
    @Primary
    public Nespresso nespresso() {
        return new Nespresso();
    }

    @Bean
    public Illy illy() {
        return new Illy();
    }
}

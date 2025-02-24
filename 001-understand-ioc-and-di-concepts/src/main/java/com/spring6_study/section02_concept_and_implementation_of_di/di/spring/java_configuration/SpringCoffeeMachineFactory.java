package com.spring6_study.section02_concept_and_implementation_of_di.di.spring.java_configuration;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoffeeMachineFactory {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                JavaConfig.class);
        CoffeeMachine coffeeMachine = context.getBean(CoffeeMachine.class);
        coffeeMachine.dripCoffee();
    }
}

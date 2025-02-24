package com.spring6_study.section02_concept_and_implementation_of_di.di.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoffeeMachineFactory {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        CoffeeMachine coffeeMachine = context.getBean(CoffeeMachine.class);
        coffeeMachine.dripCoffee();
    }
}

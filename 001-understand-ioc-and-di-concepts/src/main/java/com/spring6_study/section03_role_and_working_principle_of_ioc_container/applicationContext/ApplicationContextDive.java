package com.spring6_study.section03_role_and_working_principle_of_ioc_container.applicationContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextDive {
    public static void main(String[] args) {
        BeanFactory context = new AnnotationConfigApplicationContext();
    }
}

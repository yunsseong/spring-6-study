package com.spring6_study.section03_role_and_working_principle_of_ioc_container.simple_ioc_container;

import com.spring6_study.section03_role_and_working_principle_of_ioc_container.simple_ioc_container.ioc_container.MyApplicationContext;
import com.spring6_study.section03_role_and_working_principle_of_ioc_container.simple_ioc_container.service.ServiceA;
import com.spring6_study.section03_role_and_working_principle_of_ioc_container.simple_ioc_container.service.ServiceB;

public class Application {
    public static void main(String[] args) {
        MyApplicationContext context = new MyApplicationContext(ServiceA.class, ServiceB.class);
        ServiceA serviceA = context.getBean(ServiceA.class);
        serviceA.useB();
    }
}

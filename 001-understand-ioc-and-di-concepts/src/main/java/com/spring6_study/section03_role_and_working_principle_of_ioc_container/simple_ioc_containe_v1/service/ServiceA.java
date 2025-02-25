package com.spring6_study.section03_role_and_working_principle_of_ioc_container.simple_ioc_containe_v1.service;

import com.spring6_study.section03_role_and_working_principle_of_ioc_container.simple_ioc_containe_v1.annotation.MyAutowired;
import com.spring6_study.section03_role_and_working_principle_of_ioc_container.simple_ioc_containe_v1.annotation.MyComponent;

@MyComponent
public class ServiceA {
    private final ServiceB b;

    @MyAutowired
    public ServiceA(ServiceB b) {
        this.b = b;
    }
    public void useB() {
        System.out.println("서비스A가 서비스B를 사용하였습니다.");
        b.useB();
    }
}

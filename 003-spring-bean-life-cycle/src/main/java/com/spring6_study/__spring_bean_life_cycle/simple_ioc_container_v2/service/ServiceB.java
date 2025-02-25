package com.spring6_study.section03_role_and_working_principle_of_ioc_container.simple_ioc_container.service;

import com.spring6_study.section03_role_and_working_principle_of_ioc_container.simple_ioc_container.annotation.MyComponent;

@MyComponent
public class ServiceB {
    public void useB() {
        System.out.println("서비스B가 사용되었습니다.");
    }
}

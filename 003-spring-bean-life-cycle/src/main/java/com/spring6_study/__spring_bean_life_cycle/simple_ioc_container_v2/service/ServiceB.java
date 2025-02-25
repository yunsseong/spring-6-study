package com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.service;

import com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.annotation.MyPostConstruct;
import com.spring6_study.section03_role_and_working_principle_of_ioc_container.simple_ioc_containe_v1.annotation.MyComponent;

@MyComponent
public class ServiceB {
    public void useB() {
        System.out.println("서비스B가 사용되었습니다.");
    }

    @MyPostConstruct
    public void init() {
        System.out.println("서비스B의 @MyPostConstruct 초기화 메서드 호출");
    }
}

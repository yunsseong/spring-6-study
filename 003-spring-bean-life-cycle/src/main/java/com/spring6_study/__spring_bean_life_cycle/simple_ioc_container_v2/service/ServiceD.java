package com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.service;

import com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.annotation.MyComponent;
import com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.annotation.MyPreDestroy;

@MyComponent
public class ServiceD {
    @MyPreDestroy
    public void preDestroy() {
        System.out.println("서비스D의 @MyPreDestroy 메서드 호출");
    }
}

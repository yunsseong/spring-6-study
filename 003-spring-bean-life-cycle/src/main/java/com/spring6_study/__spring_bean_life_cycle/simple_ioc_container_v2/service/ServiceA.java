package com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.service;


import com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.annotation.MyAutowired;
import com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.annotation.MyComponent;
import com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.bean_interface.MyInitializingBean;

@MyComponent
public class ServiceA implements MyInitializingBean {
    private final ServiceB b;

    @MyAutowired
    public ServiceA(ServiceB b) {
        this.b = b;
    }
    public void useB() {
        System.out.println("서비스A가 서비스B를 사용하였습니다.");
        b.useB();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("서비스A의 afterPropertiesSet 메서드 호출");
    }
}

package com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.service;

import com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.annotation.MyComponent;
import com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.bean_interface.MyDisposableBean;

@MyComponent
public class ServiceC implements MyDisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("서비스C의 destroy 호출");
    }
}

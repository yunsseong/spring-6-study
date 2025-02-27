package com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2;


import com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.ioc_container.MyApplicationContext;
import com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.service.ServiceA;
import com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.service.ServiceB;
import com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.service.ServiceC;
import com.spring6_study.__spring_bean_life_cycle.simple_ioc_container_v2.service.ServiceD;

public class Application {
    public static void main(String[] args) {
        MyApplicationContext context = new MyApplicationContext(ServiceA.class, ServiceB.class, ServiceC.class, ServiceD.class);
        ServiceA serviceA = context.getBean(ServiceA.class);
        serviceA.useB();
        context.close();
    }
}

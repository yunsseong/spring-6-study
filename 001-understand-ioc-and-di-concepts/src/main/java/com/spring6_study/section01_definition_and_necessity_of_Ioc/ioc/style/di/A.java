package com.spring6_study.section01_definition_and_necessity_of_Ioc.ioc.style.di;

public class A {
    private final B b;

    public A(B b) {
        this.b = b;
    }

    public void hello() {
        b.hello();
    }
}

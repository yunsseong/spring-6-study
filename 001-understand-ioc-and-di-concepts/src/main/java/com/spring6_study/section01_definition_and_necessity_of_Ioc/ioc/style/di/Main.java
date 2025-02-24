package com.spring6_study.section01_definition_and_necessity_of_Ioc.ioc.style.di;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        A a = new A(b);
        a.hello();
    }
}

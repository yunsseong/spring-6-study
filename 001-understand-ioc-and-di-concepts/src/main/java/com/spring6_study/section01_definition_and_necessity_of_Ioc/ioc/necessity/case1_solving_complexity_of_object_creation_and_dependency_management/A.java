package com.spring6_study.section01.ioc.necessity.case1_solving_complexity_of_object_creation_and_dependency_management;

public class A {
    private final B b;
    public A(B b) {
        this.b = b;
    }
}

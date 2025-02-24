package com.spring6_study.section01.ioc.necessity.case1_solving_complexity_of_object_creation_and_dependency_management;

public class B {
    private final C c;
    public B(C c) {
        this.c = c;
    }
}

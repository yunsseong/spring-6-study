package com.spring6_study.section01.ioc.necessity.case1_solving_complexity_of_object_creation_and_dependency_management;

public class Main {
    public static void main(String[] args) {
        A a = new A(new B(new C()));
    }
}

package com.harrison.study.spring_study04.chapter1;

public class Main {
    public static void main(String[] args) {
        TestSertvice instance = (TestSertvice) ProxyBean.instance(TestMethod.class);
        instance.say();
        System.out.println("----------------");
        instance.walk();
    }
}

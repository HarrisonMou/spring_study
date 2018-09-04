package com.harrison.study.spring_study01.chapter10.interfaces.impl;

import org.springframework.stereotype.Component;

import com.harrison.study.spring_study01.chapter10.interfaces.Animal;

@Component
public class Dog implements Animal {

    @Override
    public void use() {
        System.out.println("狗是用来看门的！");
    }
}

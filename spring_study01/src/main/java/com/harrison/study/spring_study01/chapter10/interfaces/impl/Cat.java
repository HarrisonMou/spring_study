package com.harrison.study.spring_study01.chapter10.interfaces.impl;

import org.springframework.stereotype.Component;

import com.harrison.study.spring_study01.chapter10.interfaces.Animal;

@Component
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("猫是用来抓老鼠的！");
    }
}

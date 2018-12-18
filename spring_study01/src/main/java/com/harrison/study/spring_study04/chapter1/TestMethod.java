package com.harrison.study.spring_study04.chapter1;

public class TestMethod implements TestSertvice{

    @Around
    public void say(){
        System.out.println("say something");
    }
}

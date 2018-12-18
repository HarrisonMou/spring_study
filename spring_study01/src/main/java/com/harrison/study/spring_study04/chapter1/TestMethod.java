package com.harrison.study.spring_study04.chapter1;

public class TestMethod implements TestSertvice{

    @After
    public void say(){
        System.out.println("say something");
    }

    @Before
    @Override
    public void walk() {
        System.out.println("this is walk");
    }
}

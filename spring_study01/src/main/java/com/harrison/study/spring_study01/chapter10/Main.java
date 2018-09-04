package com.harrison.study.spring_study01.chapter10;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试Bean的生命周期 
 */
public class Main {

    @Test
    public void test1(){
    	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        ac.close();
    }
}

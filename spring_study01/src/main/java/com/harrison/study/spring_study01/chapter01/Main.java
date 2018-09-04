package com.harrison.study.spring_study01.chapter01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 学习 @Configuration注解
 *      测试@Configuration注解和@Bean注解一起使用创建注册Bean
 */
public class Main {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext 这是一个基于注解的Ioc容器 是ApplicationContext的子接口的实现
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        User bean = ac.getBean(User.class);
        System.out.println(bean);

        Object user = ac.getBean("user");
        System.out.println(user);
    }
}

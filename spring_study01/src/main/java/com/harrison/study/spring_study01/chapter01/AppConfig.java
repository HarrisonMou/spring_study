package com.harrison.study.spring_study01.chapter01;

import org.springframework.context.annotation.*;

@Configuration
/**
 *  @Configuration 代表这是一个java配置文件, spring容器会根据它来生成IOC容器去装配Bean
 */
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig初始化成功");
    }

    @Bean
    /**
     * @Bean 注解代表 将initUser方法返回的POJO装配到IOC容器中，而属性name定义这个Bean的名称，
     * 如果没有配置它，则将方法名“initUser”作为Bean的名称保存到Spring IoC容器中
     */
    public User initUser(){
        return new User("msl",18,"15681931230");
    }
}

package com.harrison.study.spring_study01.chapter02;

import com.harrison.study.spring_study01.chapter02.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.harrison.study.spring_study01.chapter02.*",
//        excludeFilters = {@ComponentScan.Filter(classes = {UserService.class})})
public class AppConfig3 {
    public AppConfig3() {
        System.out.println("AppConfig初始化成功");
    }
}

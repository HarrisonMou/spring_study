package com.harrison.study.spring_study01.chapter02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
/**
 * 注意使用 @configuration + @Component注解装配Bean一定要使用ComponentScan注解，当前配置意味着它会进行扫描
 * 但是它只会扫描AppConfig所在的包和它的子包
 */
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig初始化成功");
    }
}

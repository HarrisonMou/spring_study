package com.harrison.study.spring_study01.chapter02;

import com.harrison.study.spring_study01.bean.Location;
import com.harrison.study.spring_study01.chapter02.pojo.Address;
import com.harrison.study.spring_study01.chapter02.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.harrison.study.spring_study01.chapter02.*")
/**
 * @ComponentScan("com.harrison.study.spring_study01.bean")
 * @ComponentScan(basePackages = {"com.harrison.study.spring_study01.bean"})
 * @ComponentScan(basePackageClasses = {Location.class})
 * 以上三种配置都可以扫描到包
 */
public class AppConfig2 {
    public AppConfig2() {
        System.out.println("AppConfig初始化成功");
    }
}

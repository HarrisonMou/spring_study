package com.harrison.study.spring_study01.chapter02;

import com.harrison.study.spring_study01.bean.Location;
import com.harrison.study.spring_study01.chapter02.pojo.Address;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 学习通过 @Configuation 注解和 @Component注解 将Bean装配到容器中
 */
public class Main {

    @Test
    public void test1(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        User bean = ac.getBean(User.class);
        System.out.println(bean);

        Object user = ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void test2(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig2.class);
        Location bean = ac.getBean(Location.class);
        System.out.println(bean);
    }

    @Test
    public void test3(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig2.class);
        Address bean = ac.getBean(Address.class);
        System.out.println(bean);
    }
}

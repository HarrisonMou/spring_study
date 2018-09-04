package com.harrison.study.spring_study01.chapter03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harrison.study.spring_study01.chapter03.bean.Animal;
import com.harrison.study.spring_study01.chapter03.factorybean.AnimalFactoryBean;

public class Main {

    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
			System.out.println("====>" + name);
		}
        
        Object bean1 = ac.getBean("animalFactoryBean");
        System.out.println(bean1);
        Object bean2 = ac.getBean("animalFactoryBean");
        System.out.println(bean2);
        Animal bean3 = ac.getBean(Animal.class);
        System.out.println(bean3);
        Object bean4 = ac.getBean("&animalFactoryBean");
        System.out.println(bean4);
	}
}

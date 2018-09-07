package com.harrison.study.spring_study02.chapter04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("容器创建完成");
		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println("===>" + name);
		}
		ac.close();
		System.out.println("容器销毁完成");
	}
}

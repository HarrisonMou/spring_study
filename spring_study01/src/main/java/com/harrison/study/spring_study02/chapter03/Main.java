package com.harrison.study.spring_study02.chapter03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("容器创建完成");
		ac.close();
		System.out.println("容器销毁完成");
	}
}

package com.harrison.study.spring_study02.chapter03.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person{
	
	public Person() {
		System.out.println("Person对象被创建....");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("添加@PreDestroy注解 实现Bean的销毁");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("添加@PostConstruct注解 实现Bean的初始化");
	}

}

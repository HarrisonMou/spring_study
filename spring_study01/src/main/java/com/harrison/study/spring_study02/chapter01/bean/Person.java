package com.harrison.study.spring_study02.chapter01.bean;

public class Person {
	public Person() {
		System.out.println("Person对象被创建....");
	}
	
	public void init() {
		System.out.println("初始化方法....");
	}
	
	public void destory() {
		System.out.println("销毁方法....");
	}
}

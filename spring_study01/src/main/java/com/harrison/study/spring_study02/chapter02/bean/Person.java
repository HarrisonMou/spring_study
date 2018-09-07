package com.harrison.study.spring_study02.chapter02.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean{
	
	public Person() {
		System.out.println("Person对象被创建....");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("执行【DisposableBean】接口的destory方法 该方法为销毁方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("执行【InitializingBean】接口的afterPropertiesSet方法 该方法为初始化方法");
	}

}

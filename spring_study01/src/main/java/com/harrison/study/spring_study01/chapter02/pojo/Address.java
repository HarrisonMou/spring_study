package com.harrison.study.spring_study01.chapter02.pojo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	public Address() {
		System.out.println("加载到Address类");
	}
}

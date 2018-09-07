package com.harrison.study.spring_study02.chapter01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.harrison.study.spring_study02.chapter01.bean.Person;

@Configuration
public class AppConfig {
	
	@Bean(name = "person", initMethod = "init", destroyMethod = "destory")
	public Person person() {
		return new Person();
	}
}

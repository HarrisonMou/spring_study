package com.harrison.study.spring_study02.chapter03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.harrison.study.spring_study02.chapter03.bean.Person;


@Configuration
public class AppConfig {
	@Bean(name = "person")
	public Person person() {
		return new Person();
	}
}

package com.harrison.study.spring_study01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringStudy01Application {

	public static void main(String[] args) {
		System.out.print(new Date());
		SpringApplication.run(SpringStudy01Application.class, args);
	}
}

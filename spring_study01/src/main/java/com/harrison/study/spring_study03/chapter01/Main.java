package com.harrison.study.spring_study03.chapter01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harrison.study.spring_study03.chapter01.math.MathCalculation;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MathCalculation bean = ac.getBean(MathCalculation.class);
		
		System.out.println(bean.div(1, 2));
		
		ac.close();
	}
}

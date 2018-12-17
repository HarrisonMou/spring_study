package com.harrison.study.spring_study03.chapter01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectj {
	
	@Pointcut(value = "execution(public * com.harrison.study.spring_study03.chapter01..*.*(..))")
	public void cutPoint() {};
	
	@Before(value = "cutPoint()")
	public void beforeMath(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		for (int i = 0; i < args.length; i++) {
			Object object = args[i];
			System.out.println(object);
		}
		System.out.println("前置处理器:" + joinPoint.getSignature().getName());
	}
}

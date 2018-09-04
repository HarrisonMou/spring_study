package com.harrison.study.spring_study01.chapter03.util;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.harrison.study.spring_study01.chapter03.bean.White;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{

	/**
	 * 表示如何注册Bean
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		boolean red = registry.containsBeanDefinition("com.harrison.study.spring_study01.chapter03.bean.Red");
		boolean yellow = registry.containsBeanDefinition("com.harrison.study.spring_study01.chapter03.bean.Yellow");
		boolean blue = registry.containsBeanDefinition("com.harrison.study.spring_study01.chapter03.bean.Blue");
		
		if(red && yellow && blue) {
			BeanDefinition beanDefinition = new RootBeanDefinition(White.class);
			registry.registerBeanDefinition("white", beanDefinition);
		}
	}

}

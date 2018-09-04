package com.harrison.study.spring_study01.chapter03.factorybean;

import org.springframework.beans.factory.FactoryBean;

import com.harrison.study.spring_study01.chapter03.bean.Animal;

public class AnimalFactoryBean implements FactoryBean<Animal>{

	@Override
	public Animal getObject() throws Exception {
		return new Animal();
	}

	@Override
	public Class<?> getObjectType() {
		return Animal.class;
	}
	
	/**
	 * true:是单例
	 * false:多例
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
	
}

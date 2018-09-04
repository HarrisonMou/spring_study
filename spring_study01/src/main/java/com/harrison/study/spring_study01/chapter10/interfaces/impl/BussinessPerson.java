package com.harrison.study.spring_study01.chapter10.interfaces.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.harrison.study.spring_study01.chapter10.interfaces.Animal;
import com.harrison.study.spring_study01.chapter10.interfaces.Person;

@Component
public class BussinessPerson implements Person, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean{

    private Animal cat = null;

    @Override
    public void service() {
        cat.use();
    }

    @Override
    @Autowired
    @Qualifier("dog")
    public void setAnimal(Animal animal) {
        System.out.println("延迟依赖注入");
        this.cat = animal;
    }
    
    @PostConstruct
    public void init() {
    	System.out.println("【" + this.getClass().getSimpleName() + "】注解@PostConstruct定义的初始化方法");
    }
    
    @PreDestroy
    public void destoryClass() {
    	System.out.println("【" + this.getClass().getSimpleName() + "】注解@PreDestroy定义的自定义销毁方法");
    }

	@Override
	public void destroy() throws Exception {
		System.out.println("【" + this.getClass().getSimpleName() + "】DisposableBean的distroy方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("【" + this.getClass().getSimpleName() + "】InitializingBean的afterPropertiesSet方法");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("【" + this.getClass().getSimpleName() + "】ApplicationContextAware的setApplicationContext方法");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("【" + this.getClass().getSimpleName() + "】BeanFactoryAware的setBeanFactory方法");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("【" + this.getClass().getSimpleName() + "】BeanNameAware的setBeanName方法");
	}
}

package com.harrison.study.spring_study01.chapter03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

import com.harrison.study.spring_study01.bean.Location;
import com.harrison.study.spring_study01.chapter03.bean.Computer;
import com.harrison.study.spring_study01.chapter03.bean.Father;
import com.harrison.study.spring_study01.chapter03.bean.Red;
import com.harrison.study.spring_study01.chapter03.factorybean.AnimalFactoryBean;
import com.harrison.study.spring_study01.chapter03.util.LinuxConditional;
import com.harrison.study.spring_study01.chapter03.util.MyFilterType;
import com.harrison.study.spring_study01.chapter03.util.MyImportBeanDefinitionRegistrar;
import com.harrison.study.spring_study01.chapter03.util.MyImportSelector;
import com.harrison.study.spring_study01.chapter03.util.WindowsConditional;

@Configuration
@ComponentScan(basePackages = {"com.harrison.study.spring_study01.chapter03"}, //表示将chapter03包 及 它的子包中类注册到IOC容器
		excludeFilters = {@Filter(type = FilterType.ANNOTATION, classes = {Controller.class}), //按照注解过滤
						  @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {Father.class}), //按照按照给定的类型过滤  过滤规则为该类型的子类或子实现类
						  @Filter(type = FilterType.CUSTOM, value = MyFilterType.class) //按照自定义规则过滤
})
@ComponentScan(basePackageClasses = {Location.class}) //表示指定将Location加载到IOC容器中 并且，Location这个类必须带有 controller service Repository Component注解
@Import(value = {Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class AppConfig {
	
	@Bean
	@Conditional(value = WindowsConditional.class)
	public Computer windows() {
		return new Computer("windows");
	}
	
	@Bean
	@Conditional(value = LinuxConditional.class)
	public Computer Linux() {
		return new Computer("linux");
	}
	
	@Bean
	public AnimalFactoryBean animalFactoryBean() {
		return new AnimalFactoryBean();
	}
}

package com.harrison.study.spring_study01.chapter03.util;

import java.io.IOException;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyFilterType implements TypeFilter{

	/**
	 * 返回true表示过滤 false表示注册到IOC容器
	 * 
	 * maybe该类会遍历容器中所有的类 来进行过滤
	 */
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		String className = metadataReader.getClassMetadata().getClassName();
		if(className.equals("com.harrison.study.spring_study01.chapter03.dao.UserDao")) {
			System.out.println("通过自定义的MyFilterType过滤器过滤掉的类" + className);
			return true;
		}
		return false;
	}

}

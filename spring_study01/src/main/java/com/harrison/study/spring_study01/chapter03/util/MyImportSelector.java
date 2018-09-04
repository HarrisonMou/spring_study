package com.harrison.study.spring_study01.chapter03.util;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector{

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.harrison.study.spring_study01.chapter03.bean.Yellow", "com.harrison.study.spring_study01.chapter03.bean.Blue"};
	}

}

一学习： 注册bean到IOC容器的方法
	1.使用@Configuration注解 和 @Bean注解注册   代码查看chapter01
	2.使用@Configuation 注解和 @Component注解 将Bean装配到容器中 -- 代码查看chapter02
	    注意一定要使用@ComponentScan注解，当前配置意味着它会通过该注解进行扫描，然后将bean添加到IOC容器中
	3.@ComponentScan注解使用---指定扫描规则 chapter03
		3.1 basePackages :表示要扫描的包路径  string[] 例如：com.harrison.study.spring_study01.chapter03 表示扫描chapter3包和它的所有子包中 带有 controller service Repository Component注解的类 将它们添加到IOC容器中
		3.2 basePackageClasses :表示要扫描的类  类似于上述的basePackages
		3.3 excludeFilters :指定不适合组件扫描的类型 
		3.4 includeFilters :指定哪些类型有资格用于组件扫描
	4.使用conditional注解注册Bean 使用该注解表示按照一定的条件进行判断，满足条件的Bean注册到IOC容器中  --代码查看chapter03
	    该注解可以写在类和方法上
	5.使用Import进行组件注册 将bean装配到IOC容器中  --代码查看chapter03
	6.使用FactoryBean的方式将Bean装配到容器中 代码查看chapter03
		从工厂中获得实例如下  最后加上&符号表示获取工厂类
		/*
		Object bean1 = ac.getBean("animalFactoryBean");
        System.out.println(bean1);
        Object bean2 = ac.getBean("animalFactoryBean");
        System.out.println(bean2);
        Animal bean3 = ac.getBean(Animal.class);
        System.out.println(bean3);
        Object bean4 = ac.getBean("&animalFactoryBean");
        System.out.println(bean4);
        */
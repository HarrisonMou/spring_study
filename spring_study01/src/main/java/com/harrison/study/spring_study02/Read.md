Bean的生命周期
流程：Bean的定义 --> Bean的初始化 --> Bean的生存期 --> Bean的销毁

1.Bean的初始化和销毁：
	1.1 通过@Bean(initMethord="", destoryMethord="")来实现bean的初始化与销毁   ---代码位置 chapter01
	1.2 通过实现InitializingBean接口的afterPropertiesSet方法达到初始化   ---代码位置 chapter02
	       通过实现DisposableBean接口的destroy方法来实现销毁
	1.3 通过在初始化方法和销毁方法上添加注解来实现初始化和销毁   ---代码位置 chapter03
	       使用的是JSR250的注解：@PostConstruct注解标注的方法为初始化方法  @PreDestroy注解标注的方法为销毁方法
	1.4 通过实现BeanPostProcessor接口（Bean的后置处理器）:
	       在bean初始化之前会调用postProcessBeforeInitialization方法
	       在bean初始化之后会调用postProcessAfterInitialization方法